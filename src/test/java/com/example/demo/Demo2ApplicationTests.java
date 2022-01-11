package com.example.demo;

import com.example.domain.AtmTraffic;
import com.example.domain.Customer;
import com.example.mapper.AtmTrafficMapper;
import com.example.mapper.CustomerMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class Demo2ApplicationTests {

    @Resource
    private CustomerMapper customerMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Customer> atmTrafficsList = customerMapper.selectList(null);
        Assertions.assertEquals(2, atmTrafficsList.size());
        atmTrafficsList.forEach(System.out::println);
    }

}
