package de.jonashackt.springeasyrules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("de.jonashackt")
@EnableAutoConfiguration
@EnableConfigurationProperties // needed, to automatically load rules.yml defined properties to Rule-Pojos fields, see http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html
public class SpringEasyRulesApplication {

	
    public static void main(String[] args) {
        SpringApplication.run(SpringEasyRulesApplication.class, args);
    }
}
