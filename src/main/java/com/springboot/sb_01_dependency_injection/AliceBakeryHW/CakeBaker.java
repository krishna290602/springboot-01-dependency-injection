package com.springboot.sb_01_dependency_injection.AliceBakeryHW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    @Autowired
    private Frosting frosting;

    @Autowired
    private Syrup syrup;

    public void bakeCake(){
        System.out.println("Baking cake from CakeBaker");
        System.out.println("Frosting Type : "+  frosting.getFrostingType());
        System.out.println("Syrup Type : " +  syrup.getSyrupType());
        System.out.println("Baking Complete :)");
    }
}
