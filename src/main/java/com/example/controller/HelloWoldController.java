package com.example.controller;

import com.example.domain.Customer;
import com.example.mapper.AtmTrafficMapper;
import com.example.mapper.CustomerMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloWoldController {



    @Resource
    private CustomerMapper customerMapper;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(("----- selectAll method test ------"));
        List<Customer> atmTrafficsList = customerMapper.selectList(null);
        atmTrafficsList.forEach(System.out::println);
        return atmTrafficsList.toString();
    }

}
