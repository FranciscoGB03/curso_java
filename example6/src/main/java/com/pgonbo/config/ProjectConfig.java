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


    /*
    * Spring inyecta el vehiculo bean a la persona bean usando inyección de dependencias.
    * Con esto Spring se asegurará de que solo 1 vehiculo bean es creado y tambien sera creado primero el bean de vehiculo.
    * */
    @Bean
    public Person person(Vehicle vehicle){
        Person person=new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle);
        return person;
    }

}
