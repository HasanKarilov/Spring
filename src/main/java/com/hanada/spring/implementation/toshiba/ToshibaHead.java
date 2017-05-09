package com.hanada.spring.implementation.toshiba;

import com.hanada.spring.interfaces.Head;
import org.springframework.stereotype.Component;

/**
 * Created by hanaria on 5/7/17.
 */
@Component
public class ToshibaHead implements Head {
    public void calc() {
        System.out.println("Toshiba head thinking.");
    }
}
