package com.jspiders;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.jspiders","com.jspiders.controller", "com.jspiders.service", "com.jspiders.model", "com.jspiders.repository"})
public class MovieConfig {

}
