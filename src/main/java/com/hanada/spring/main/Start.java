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
        T800 modelT800 = (T800) context.getBean("t800withProperty");
        System.out.println(modelT800.getHead());
        modelT800 = (T800) context.getBean("t800withProperty");
        System.out.println(modelT800.getHead());
        modelT800 = (T800) context.getBean("t800withProperty");
        System.out.println(modelT800.getHead());

        /* В prototype при каждом обращении к бину создается новый обьект
        com.hanada.spring.implementation.sony.SonyHead@6536e911
        com.hanada.spring.implementation.sony.SonyHead@520a3426
        com.hanada.spring.implementation.sony.SonyHead@18eed359
        */
    }
}
