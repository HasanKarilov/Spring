package com.hanada.spring.implementation.sony;

import com.hanada.spring.interfaces.Head;

/**
 * Created by hanaria on 5/7/17.
 */
public class SonyHead implements Head {
    private String color;

    public void calc() {
        System.out.println("Sony head thinking.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
