package com.phantom.serviceimpl;

import com.phantom.entity.Student;
import com.phantom.service.IHelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by john on 2017/12/25.
 */
@Component
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry " + name + "error!";
    }


    @Override
    public Student sayHiBodyFromClientOne(@RequestBody Student student) {
        return student;
    }
}
