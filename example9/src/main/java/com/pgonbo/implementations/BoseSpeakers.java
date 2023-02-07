package com.pgonbo.implementations;

import com.pgonbo.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {


    public String makeSound() {
        return "Playing  music with Bose speakers";
    }
}
