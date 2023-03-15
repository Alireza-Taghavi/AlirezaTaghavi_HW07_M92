package org.example.Classes;

import org.example.Turner;

public class Door implements Turner {
    @Override
    public void turn() {
        System.out.println("Opening/closing the door.");
    }
}
