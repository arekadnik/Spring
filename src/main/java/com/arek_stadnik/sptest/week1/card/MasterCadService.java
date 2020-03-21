package com.arek_stadnik.sptest.week1.card;

import org.springframework.stereotype.Service;

@Service

public class MasterCadService implements Card {

    public MasterCadService() {
    }

    @Override
    public String getInfo() {
        return "MasterCadService";
    }
}
