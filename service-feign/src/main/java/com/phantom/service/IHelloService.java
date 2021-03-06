package com.phantom.service;

import com.phantom.entity.Student;
import com.phantom.serviceimpl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by john on 2017/12/23.
 */

@Service
@FeignClient(value = "service-hi", fallback = HelloServiceImpl.class)
public interface IHelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hiBody",method = RequestMethod.POST)
    Student sayHiBodyFromClientOne(@RequestBody Student student);
}
