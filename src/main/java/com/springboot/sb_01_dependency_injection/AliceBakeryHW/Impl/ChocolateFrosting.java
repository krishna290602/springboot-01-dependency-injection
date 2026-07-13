package com.springboot.sb_01_dependency_injection.AliceBakeryHW.Impl;

import com.springboot.sb_01_dependency_injection.AliceBakeryHW.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.type", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting {
    @Override
    public String getFrostingType() {
        return "Chocolate Frost";
    }
}
