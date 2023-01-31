package com.pgonbo.beans;

import org.springframework.stereotype.Component;

@Component
public class VehicleComponent {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void printHello(){
        System.out.println("Printing hello from Component Vehicle Bean");
    }
}
