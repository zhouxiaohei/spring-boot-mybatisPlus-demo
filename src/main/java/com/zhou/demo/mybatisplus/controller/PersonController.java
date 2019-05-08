package com.zhou.demo.mybatisplus.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhou.demo.mybatisplus.dao.bean.Person;
import com.zhou.demo.mybatisplus.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName PersonController
 * @Description 诊断分析报告
 * @Author JackZhou
 * @Date 2019/5/6  11:33
 **/
@Controller
@RequestMapping("/mybatisplus/demp/")
@Slf4j
@Api("诊断分析报告管理")
public class PersonController{

    @Autowired
    private PersonService personService;

    @ApiOperation("简单查询")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Person simpleQuery(@PathVariable("id") String id){
        return personService.getById(id);
    }

    @ApiOperation("简单保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public boolean save(@RequestBody  Person person){
        log.info("----保存测试----");
        return personService.save(person);
    }

    @ApiOperation("分页查询")
    @RequestMapping(value = "/findByPage", method = RequestMethod.GET)
    @ResponseBody
    public IPage<Person> findByPage(@RequestParam(required = false) String name){
        return personService.findByPage(name);
    }

    @ApiOperation("分页查询使用")
    @RequestMapping(value = "/findPageTest", method = RequestMethod.GET)
    @ResponseBody
    public IPage<Person> findPageTest(@RequestParam(required = false) String name){
        return personService.testPage(name);
    }

}
