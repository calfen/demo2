package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.AttackAlarm;
import com.example.service.AttackAlarmService;
import com.example.mapper.AttackAlarmMapper;
import org.springframework.stereotype.Service;

/**
* @author calfen
* @description 针对表【attack_alarm(报警表)】的数据库操作Service实现
* @createDate 2022-01-11 13:37:36
*/
@Service
public class AttackAlarmServiceImpl extends ServiceImpl<AttackAlarmMapper, AttackAlarm>
    implements AttackAlarmService{

}




