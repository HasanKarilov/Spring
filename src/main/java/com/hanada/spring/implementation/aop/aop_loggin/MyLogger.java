package com.hanada.spring.implementation.aop.aop_loggin;

import org.springframework.stereotype.Component;

/**
 * Наш простой класс для логгирования
 * Метод printValue(Object obj) просто выводит любой переданный обьект.
 */
@Component
public class MyLogger {
    public void printValue(Object obj) {
        System.out.println(obj + " in my simple Logger");
    }

    public void init() {
        System.out.println("init in MyLogger");
    }

    public void close() {
        System.out.println("close in MyLogger");
    }

}
