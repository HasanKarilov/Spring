package com.hanada.spring.implementation.toshiba;

import com.hanada.spring.interfaces.Hand;
import org.springframework.stereotype.Component;

/**
 * Created by hanaria on 5/7/17.
 */
@Component
public class ToshibaHand implements Hand {
    public void catchSomething() {
        System.out.println("Toshiba hand catching.");
    }
}
