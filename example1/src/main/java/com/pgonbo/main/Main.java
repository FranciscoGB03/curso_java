package com.pgonbo.main;

import com.pgonbo.beans.Vehicle;
import com.pgonbo.beans.VehicleComponent;
import com.pgonbo.config.ProjectConfig;
import com.pgonbo.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle();
        vehicle.setName("honda city");
        System.out.println("Vehicle name from non-spring context is: "+vehicle.getName());

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        //Sin nombre personalizado al bean
        //Vehicle veh= context.getBean("vehicle1",Vehicle.class);

        Vehicle veh= context.getBean("audiVehicle",Vehicle.class);
        System.out.println("vehicle name from Spring Context is: "+veh.getName());

        Vehicle veh2= context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("vehicle name from Spring Context is: "+veh2.getName());

        Vehicle veh3= context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("vehicle name from Spring Context is: "+veh3.getName());

        System.out.println("-------------------------------");
        //utilizando el bean por defecto
        Vehicle veh4=context.getBean(Vehicle.class);
        System.out.println("vehicle name from Spring Context is: "+veh4.getName());

        System.out.println("---------Usando componentes para crear beans--------");
        var context2= new AnnotationConfigApplicationContext(ProjectConfig2.class);
        VehicleComponent veh5=context2.getBean(VehicleComponent.class);
        System.out.println("Component Vehicle name from Spring Context is: "+ veh5.getName());
        veh5.printHello();


        System.out.println("-----------otros bean-------------");
        String hello=context.getBean(String.class);
        System.out.println("String value from Spring Context is: "+hello);

        Integer num=context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: "+num);

    }
}