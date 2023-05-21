package com.pgonbo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.pgonbo.implementation",
        "com.pgonbo.services"})
@ComponentScan(basePackageClasses = {com.pgonbo.beans.Vehicle.class,
        com.pgonbo.beans.Person.class})
public class ProjectConfig {

}
