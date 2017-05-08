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
        если указать default-init-method и default-destroy-method то они
        будут вызываться во всех бинах при инициализации и уничтожении

        init.
        init.
        init.
        com.hanada.spring.implementation.toshiba.ToshibaHead@3e9b1010
        init.
        com.hanada.spring.implementation.toshiba.ToshibaHead@185d8b6
        init.
        com.hanada.spring.implementation.toshiba.ToshibaHead@67784306
        */
    }
}
