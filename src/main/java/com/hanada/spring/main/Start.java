package com.hanada.spring.main;

import com.hanada.spring.implementation.T800;
import com.hanada.spring.implementation.aop.aop_objects.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hanaria on 5/7/17.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService service = (SomeService) context.getBean("someService");
        service.getIntValue();

        /*
        init in MyLogger        - Тип совета before
        Some service            - В теле нашего метода в SomeService
        close in MyLogger       - Тип совета after
        5 in my simple Logger   - Тип совета after-returning
         */

    }
}
