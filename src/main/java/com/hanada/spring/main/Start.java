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
        System.out.println(modelT800);
        /*
        BeanPostProcessor:

        com.hanada.spring.implementation.toshiba.ToshibaHand@78c03f1f - postProcessBeforeInitialization()
        com.hanada.spring.implementation.sony.SonyHead@5a8e6209 - postProcessBeforeInitialization()
        com.hanada.spring.implementation.sony.SonyLeg@4b4523f8 - postProcessBeforeInitialization()
        com.hanada.spring.implementation.T800@731a74c - method init()
        com.hanada.spring.implementation.T800@731a74c - postProcessBeforeInitialization()
        com.hanada.spring.implementation.T800@731a74c
         */
    }
}
