package com.pgonbo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//con la anotacion component
@ComponentScan(basePackages = "com.pgonbo.beans")
public class ProjectConfig2 {

}
