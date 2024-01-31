package org.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.annotation")       // if we use Component anno. then we need to specify the ComponentScan
public class CollegeConfig {
    @Bean
    public College collegeBean(){       //this method name represents the Bean Name/id
//        College college = new College();
        return new College();
    }
}
