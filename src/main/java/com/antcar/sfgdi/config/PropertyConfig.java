package com.antcar.sfgdi.config;

import com.antcar.sfgdi.examplebeans.FakeDataSource;
import com.antcar.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${antcar.username}")
    String user;

    @Value("${antcar.password}")
    String password;

    @Value("${antcar.dburl}")
    String url;

    @Value("${antcar.jms.username}")
    String jmsUsername;

    @Value("${antcar.jms.password}")
    String jmsPassword;

    @Value("${antcar.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

}
