package com.hanada.spring.implementation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor используются при каждом инициализации нашего бина
 * При инициализации будут вызываться вот эти методы
 * postProcessBeforeInitialization(Object o, String s) - до инициализации
 * postProcessAfterInitialization(Object o, String s) -  после инициализации
 * Здесь мы можем участвовать в жизненном цикле нашего бина, делать доп обработки (похоже на фильтрацию)
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println(o + " - postProcessBeforeInitialization()");
        return o;
    }
}
