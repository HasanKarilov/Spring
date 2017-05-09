package com.hanada.spring.implementation.toshiba;

import com.hanada.spring.interfaces.Leg;
import org.springframework.stereotype.Component;

/**
 * Created by hanaria on 5/7/17.
 */
@Component
public class ToshibaLeg implements Leg {
    public void go() {
        System.out.println("Toshiba leg going.");
    }
}
