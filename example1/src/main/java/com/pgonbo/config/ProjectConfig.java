package com.pgonbo.config;

import com.pgonbo.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="audiVehicle")
    Vehicle vehicle1(){
        var veh=new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    @Bean(value="hondaVehicle")
    Vehicle vehicle2(){
        var veh=new Vehicle();
        veh.setName("Honda");
        return veh;
    }
    @Primary //Elige este bean por defecto en caso de que no se especifique un nombre
    @Bean("ferrariVehicle")
    Vehicle vehicle3(){
        var veh=new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean
    String hello(){
        return "hello world!";
    }

    @Bean
    Integer number(){
        return 16;
    }
}
