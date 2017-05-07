package com.hanada.spring.implementation;

import com.hanada.spring.interfaces.Hand;
import com.hanada.spring.interfaces.Head;
import com.hanada.spring.interfaces.Leg;
import com.hanada.spring.interfaces.Robot;

/**
 * Created by hanaria on 5/7/17.
 */
public class T800 implements Robot {

    private Head head;
    private Leg leg;
    private Hand hand;

    private String color;
    private int year;
    private boolean isSoungEnable;

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
        System.out.println("Coler: " + color + " year: " + year + " can sound: " + isSoungEnable);
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
