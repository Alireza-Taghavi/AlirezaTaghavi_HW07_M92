package org.example.Classes;

import org.example.Turner;

public class Leaf implements Turner {
    @Override
    public void turn() {
        System.out.println("Leaf is changing colors.");
    }
}
