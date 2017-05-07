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

    public T800(){

    }

    public T800(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public void doAction(){
        System.out.println("Robot do action");
        head.calc();
        leg.go();
        hand.catchSomething();
    }


}
