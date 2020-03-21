package com.arek_stadnik.sptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {
    MessageSource messageSource;

    @Autowired
    public MessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
        String text = messageSource.getMessage("hello",new Object[]{"Arek","Stadnik"}, Locale.forLanguageTag("pl"));
        System.out.println(text);
    }
}
