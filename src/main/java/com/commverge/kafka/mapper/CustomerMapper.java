package com.commverge.kafka.mapper;

import com.commverge.kafka.domain.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
* @author calfen
* @description 针对表【customer(云堤客户基本信息表)】的数据库操作Mapper
* @createDate 2022-01-11 17:28:06
* @Entity com.example.domain.Customer
*/
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {
    @Select("select customer_name from customer where id = #{id}")
    String queryById(@Param("id") int id);


}




