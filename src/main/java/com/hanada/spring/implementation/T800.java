package com.hanada.spring.implementation;

import com.hanada.spring.interfaces.Hand;
import com.hanada.spring.interfaces.Head;
import com.hanada.spring.interfaces.Leg;
import com.hanada.spring.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by hanaria on 5/7/17.
 */

// В @Component бин будет называться как класс компонент, только первая буква с маленькой буквы
@Component
public class T800 implements Robot {

    /*
    @Autowired(required = false) по умолчанию true, false - значит если найдет элементы
     (head, leg, hand т.е. не примитивные типы) то все хорошо, если не найдет тоже не страшно. Т.е. будет инициализировано как null
     */
    @Autowired
    private Head head;
    @Autowired
    private Leg leg;
    @Autowired
    private Hand hand;

    private String color;
    private int year;
    private boolean isSoungEnable;

    @Bean
    //Scope default = Singleton
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public T800 model1(){
        return new T800();
    }
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public T800 model2(){
        return new T800("Red", 2017, true);
    }

    public T800(){

    }

    public T800(Head head, Leg leg, Hand hand) {
        super();
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public T800(Head head, Leg leg, Hand hand, String color, int year, boolean isSoungEnable) {
        super();
        this.head = head;
        this.leg = leg;
        this.hand = hand;
        this.color = color;
        this.year = year;
        this.isSoungEnable = isSoungEnable;
    }

    public T800(String color, int year, boolean isSoungEnable) {
        super();
        this.color = color;
        this.year = year;
        this.isSoungEnable = isSoungEnable;
    }

    public void doAction(){
        System.out.println("Robot do action");
        head.calc();
        leg.go();
        hand.catchSomething();
        System.out.println("Color: " + color + " year: " + year + " can sound: " + isSoungEnable);
    }

    public void initMethod(){
        System.out.println("init.");
    }

    public void destroyMethod(){
        System.out.println("Destroy.");
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoungEnable() {
        return isSoungEnable;
    }

    public void setSoungEnable(boolean soungEnable) {
        isSoungEnable = soungEnable;
    }
}
