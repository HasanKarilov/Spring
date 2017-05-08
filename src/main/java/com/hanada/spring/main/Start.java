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
        Последовательность инициализаций бинов. В xml атрибут depends-on = "имя бина" указывает что сначала
        инициализируется бин указанный в depends-on потом сам бин
        Test connection!
        com.hanada.spring.implementation.Database@ae45eb6 - postProcessBeforeInitialization()
        com.hanada.spring.implementation.toshiba.ToshibaHand@3e9b1010 - postProcessBeforeInitialization()
        com.hanada.spring.implementation.sony.SonyHead@5ae63ade - postProcessBeforeInitialization()
        com.hanada.spring.implementation.sony.SonyLeg@610694f1 - postProcessBeforeInitialization()
        com.hanada.spring.implementation.T800@43814d18 - method init()
        com.hanada.spring.implementation.T800@43814d18 - postProcessBeforeInitialization()
        com.hanada.spring.implementation.T800@43814d18
         */
    }
}
