package com.pgonbo.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    // spring ejecuta este método después de crear el Bean
    @PostConstruct
    public void initialize(){
        this.name="Honda";
    }

    public void printHello(){
        System.out.println(
                "Printing Hello from Component Vehicle Bean");
    }

    //Spring se asegurará de llamar este método solo antes de limpiar y destruir el contexto.
    @PreDestroy
    public void destroy(){
        System.out.println("Destruyendo Vehicle Bean");
    }

}
