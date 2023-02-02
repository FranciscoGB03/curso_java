package com.pgonbo.config;

import com.pgonbo.beans.Person;
import com.pgonbo.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    public Person person(){
        Person person=new Person();
        person.setName("Larry");
        person.setVehicle(vehicle());
        return person;
    }
}
