package com.commverge.kafka.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.commverge.kafka.domain.Customer;
import com.commverge.kafka.domain.Person;
import com.commverge.kafka.mapper.CustomerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloWoldController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private CustomerMapper customerMapper;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(("----- selectAll method test ------"));
        List<Customer> atmTrafficsList = customerMapper.selectList(null);
//        atmTrafficsList.forEach(System.out::println);
//        String customerName = customerMapper.queryById(1);
//        return customerName;
        return JSON.toJSONString(atmTrafficsList);
    }
    @RequestMapping("/customer/insert")
    public String insertCustomer(){
        String demoJson = "{\"type\":\"customer\",\"data\":{\"custumer_id\":\"commverge\",\"custumer_name\":\"上海打砸抢公司\",\"wihite_ip\":\"66.4.5.67\",\"province\":\"shanghai\",\"area\":\"pudong\",\"industry\":\"交通\",\"Secret_key\":\"abcdefrfes\",\"private _key\":\"dkjgfksggd\",\"op\":\"add\"}}";
        JSONObject receiveJason = JSON.parseObject(demoJson);
        JSONObject customerJason = receiveJason.getJSONObject("data");
        Customer receiveCustomer = JSON.toJavaObject(customerJason,Customer.class);
        customerMapper.updateById(receiveCustomer);
        return "ok";
    }
    @Resource
    public Person person;
    @RequestMapping("/hello/person")
    public Person showPerson(){
        logger.info("retrun person");
        return person;
    }

}
