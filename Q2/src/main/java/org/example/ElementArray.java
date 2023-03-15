package org.example;

public class ElementArray {
    private Element[] elements;

    public ElementArray(Element[] elements) {
        this.elements = elements;

        int metalCount = 0;
        int nonMetalCount = 0;

        for (Element element : elements) {
            if (element instanceof MetalElement) {
                metalCount++;
            } else if (element instanceof NonMetalElement) {
                nonMetalCount++;
            }
        }

        if (metalCount < 2 || nonMetalCount < 2) {
            throw new IllegalArgumentException("There must be at least two MetalElement objects and two NonMetalElement objects in the array");
        }
    }

    public void displayElements() {
        for (Element element : elements) {
            element.describeElement();
            System.out.println();
        }
    }
}
