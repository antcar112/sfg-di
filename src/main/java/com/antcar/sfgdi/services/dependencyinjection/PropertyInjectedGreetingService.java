package com.antcar.sfgdi.services.dependencyinjection;

import com.antcar.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
