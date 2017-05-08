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
        modelT800 = (T800) context.getBean("t800");
        System.out.println(modelT800.getHead());
        modelT800 = (T800) context.getBean("t800");
        System.out.println(modelT800.getHead());

        /*
        lazy-init будем создавать бины по обращении, по умолчанию контейнер инициализирует
        все бины даже если они не используются

        init.
        com.hanada.spring.implementation.toshiba.ToshibaHead@3632be31
        init.
        com.hanada.spring.implementation.toshiba.ToshibaHead@4e9ba398
        init.
        com.hanada.spring.implementation.toshiba.ToshibaHead@6d7b4f4c
        */
    }
}
