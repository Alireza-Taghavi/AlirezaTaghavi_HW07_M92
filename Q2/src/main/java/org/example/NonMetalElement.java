package org.example;

public class NonMetalElement extends Element {
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    public void describeElement() {
        System.out.println(getSymbol() + " is a non-metal with atomic number " + getAtomicNumber() + " and atomic weight " + getAtomicWeight() + ". Non-metals are poor conductors of electricity.");
    }
}
