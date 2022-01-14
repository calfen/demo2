package com.commverge.kafka.demo;

import com.commverge.kafka.mapper.CustomerMapper;
import com.commverge.kafka.domain.Customer;
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
