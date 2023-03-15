package org.example.Classes;

import org.example.Turner;

public class Pancake implements Turner {
    @Override
    public void turn() {
        System.out.println("Flipping the pancake.");
    }
}
