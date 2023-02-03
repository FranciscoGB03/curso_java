package com.pgonbo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Larry";

    /*
    The @Autowired annotation marks on a field, constructor, setter method
    is used to auto-wired the beans that is injecting beans (Objects) at
    runtime by spring dependency Injection mechanism
    * */
    @Autowired
    private Vehicle vehicle;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }
}
