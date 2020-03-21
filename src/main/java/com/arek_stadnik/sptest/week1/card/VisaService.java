package com.arek_stadnik.sptest.week1.card;

import org.springframework.stereotype.Service;

@Service
public class VisaService implements Card {

    public VisaService() {
    }

    @Override
    public String getInfo() {
        return "VisaService";
    }
}
