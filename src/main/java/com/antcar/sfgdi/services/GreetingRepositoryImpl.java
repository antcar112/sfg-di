package com.antcar.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello World - EN";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Mundo - ES";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst - DE";
    }
}
