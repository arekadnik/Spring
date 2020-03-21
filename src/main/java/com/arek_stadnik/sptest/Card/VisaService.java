package com.arek_stadnik.sptest.Card;

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
