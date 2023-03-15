package org.example.Classes;

import org.example.Turner;

public class LightSwitch implements Turner {
    @Override
    public void turn() {
        System.out.println("Turning the light switch on/off.");
    }
}
