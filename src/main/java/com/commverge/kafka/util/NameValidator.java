package com.commverge.kafka.util;

import org.springframework.stereotype.Component;

@Component
public class NameValidator implements Validator {
    public void validate(String email, String password, String name) {
        if (name == null || name.isEmpty() || name.length() > 20) {
            throw new IllegalArgumentException("invalid name: " + name);
        }
    }
}
