package com.commverge.kafka.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.commverge.kafka.domain.AttackAlarm;
import com.commverge.kafka.domain.Person;

public interface PersonService   {
    Person getPersonInfo();
}
