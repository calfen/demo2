package com.commverge.kafka.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.commverge.kafka.mapper.CustomerMapper;
import com.commverge.kafka.domain.Customer;
import com.commverge.kafka.service.CustomerService;
import org.springframework.stereotype.Service;

/**
* @author calfen
* @description 针对表【customer(云堤客户基本信息表)】的数据库操作Service实现
* @createDate 2022-01-11 17:28:06
*/
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
    implements CustomerService{

}




