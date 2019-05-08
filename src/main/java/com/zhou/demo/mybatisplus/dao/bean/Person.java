package com.zhou.demo.mybatisplus.dao.bean;


import com.baomidou.mybatisplus.annotation.SqlCondition;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName Person
 * @Description
 * @Author JackZhou
 * @Date 2019/5/7  9:59
 **/

@Data
@TableName("tb_person")
public class Person{
   private String id;
   @TableField(condition = SqlCondition.LIKE)
   private String name;
   private int age;
}
