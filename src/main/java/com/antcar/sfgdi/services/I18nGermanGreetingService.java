package com.antcar.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DE")
@Service("i18nService")
public class I18nGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primärer Grußdienst - DE";
    }
}
