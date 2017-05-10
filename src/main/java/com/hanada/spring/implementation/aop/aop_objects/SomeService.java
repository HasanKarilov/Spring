package com.hanada.spring.implementation.aop.aop_objects;

import org.springframework.stereotype.Component;

/**
 * Created by hanaria on 5/9/17.
 */
@Component
public class SomeService {
    public int getIntValue() {
        return 5;
    }

    public double getDoubleValue() {
        return 5.6;
    }
}
