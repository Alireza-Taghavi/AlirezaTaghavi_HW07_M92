package org.example;

public class ElementArray {
    private Element[] elements;

    public ElementArray(Element[] elements) {
        this.elements = elements;
    }

    public void displayElements() {
        for (Element element : elements) {
            element.describeElement();
            System.out.println();
        }
    }
}

