package com.pgonbo;

import com.pgonbo.beans.Person;
import com.pgonbo.beans.Vehicle;
import com.pgonbo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        String []persons=context.getBeanNamesForType(Person.class);
        Person person=context.getBean(Person.class);
        String []names=context.getBeanNamesForType(Vehicle.class);
        System.out.println(persons.length);
        /*Vehicle vehicle=context.getBean(Vehicle.class);
        vehicle.getVehicleService().playMusic();
        vehicle.getVehicleService().moveVehicle();*/
        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().moveVehicle();
    }
}