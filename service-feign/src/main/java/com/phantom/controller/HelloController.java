package com.phantom.controller;

import com.phantom.entity.Student;
import com.phantom.service.IHelloService;
/*import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by john on 2017/12/23.
 */
@RestController
//@Api("测试集成swagger")
public class HelloController {

    @Resource
    IHelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }

    //@ApiOperation(value = "/hiBody", httpMethod = "POST", response = Student.class,responseReference = "student",notes = "学生实体")
    @RequestMapping(value = "/hiBody",method = RequestMethod.POST)
    public Student sayHiBody(@RequestBody Student student){
        return helloService.sayHiBodyFromClientOne(student);
    }
}
