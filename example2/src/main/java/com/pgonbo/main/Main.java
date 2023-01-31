package com.pgonbo.main;

import com.pgonbo.beans.Vehicle;
import com.pgonbo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from " +
                "Spring Context is: " + vehicle.getName());
        vehicle.printHello();
        context.close();

    }
}