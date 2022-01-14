package com.commverge.kafka.util;


public interface Validator {
    void validate(String email, String password, String name);
}

