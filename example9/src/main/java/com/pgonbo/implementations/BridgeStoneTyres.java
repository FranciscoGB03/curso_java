package com.pgonbo.implementations;

import com.pgonbo.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    public String rotate(){
        return "Vehicule moving with BridgeStone tyres";
    }
}
