package com.pgonbo;

import com.pgonbo.beans.Person;
import com.pgonbo.beans.Vehicle;
import com.pgonbo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person=context.getBean(Person.class);
        Vehicle vehicle=context.getBean(Vehicle.class);
        System.out.println("Person name from Spring context is: " + person.getName());
        System.out.println("Vehicle name from Spring context is: " + vehicle.getName());
        System.out.println("Vehicle that person own is: " + person.getVehicle());
    }
}