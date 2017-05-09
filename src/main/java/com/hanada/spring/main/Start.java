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
        T800 modelT800 = (T800) context.getBean("model1");
        T800 modelT8002 = (T800) context.getBean("model2");
        modelT800.doAction();
        System.out.println();
        modelT8002.doAction();

    }
}
