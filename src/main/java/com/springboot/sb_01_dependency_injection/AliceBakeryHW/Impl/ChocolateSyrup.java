package com.springboot.sb_01_dependency_injection.AliceBakeryHW.Impl;

import com.springboot.sb_01_dependency_injection.AliceBakeryHW.Syrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
