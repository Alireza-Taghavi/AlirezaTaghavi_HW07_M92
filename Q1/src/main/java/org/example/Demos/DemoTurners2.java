package org.example.Demos;

import org.example.Classes.*;
import org.example.Turner;

public class DemoTurners2 {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        leaf.turn();

        Turner page = new Page();
        page.turn();

        Turner pancake = new Pancake();
        pancake.turn();

        Turner lightSwitch = new LightSwitch();
        lightSwitch.turn();

        Turner door = new Door();
        door.turn();
    }
}
