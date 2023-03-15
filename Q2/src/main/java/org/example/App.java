package org.example;

public class App {
    public static void main(String[] args) {
        Element carbon = new NonMetalElement("C", 6, 12.01);
        Element iron = new MetalElement("Fe", 26, 55.85);
        Element copper = new MetalElement("Cu", 29, 63.55);
        Element oxygen = new NonMetalElement("O", 8, 15.99);

        Element[] elements = {
                carbon,
                iron,
                copper,
                oxygen
        };

        ElementArray elementArray = new ElementArray(elements);
        elementArray.displayElements();
    }

}
