package com.hanada.spring.main;

import com.hanada.spring.implementation.T800;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hanaria on 5/7/17.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        T800 modelT800 = (T800) context.getBean("t800");
        System.out.println(modelT800.getHead());
        /*
        com.hanada.spring.implementation.T800@10bdf5e5 - method init()
        com.hanada.spring.implementation.T800@1d16f93d - method init()
        com.hanada.spring.implementation.sony.SonyHead@67b92f0a
         */
    }
}
