package com.arek_stadnik.sptest.week1.profiles;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("Premium")
public class ShopPremium {

    @EventListener(ApplicationReadyEvent.class)
    public void get(){
        System.out.println("ShopPremium");
    }
}
