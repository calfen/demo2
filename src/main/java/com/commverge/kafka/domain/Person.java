package com.commverge.kafka.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person implements Serializable {
    private String name;
    private Integer age;
    private List<Object> departperson;
}
