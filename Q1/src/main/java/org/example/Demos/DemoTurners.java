package org.example.Demos;

import org.example.Classes.Leaf;
import org.example.Classes.Page;
import org.example.Classes.Pancake;
import org.example.Turner;

public class DemoTurners {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        leaf.turn();

        Turner page = new Page();
        page.turn();

        Turner pancake = new Pancake();
        pancake.turn();
    }
}
