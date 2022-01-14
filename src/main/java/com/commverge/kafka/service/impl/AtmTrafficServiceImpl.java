package com.commverge.kafka.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.commverge.kafka.domain.AtmTraffic;
import com.commverge.kafka.service.AtmTrafficService;
import com.commverge.kafka.mapper.AtmTrafficMapper;
import org.springframework.stereotype.Service;

/**
* @author calfen
* @description 针对表【atm_traffic(攻击流量表)】的数据库操作Service实现
* @createDate 2022-01-11 13:36:12
*/
@Service
public class AtmTrafficServiceImpl extends ServiceImpl<AtmTrafficMapper, AtmTraffic>
    implements AtmTrafficService{

}




