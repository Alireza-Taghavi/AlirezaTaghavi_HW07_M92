package org.example;

public class MetalElement extends Element {
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    public void describeElement() {
        System.out.println(getSymbol() + " is a metal with atomic number " + getAtomicNumber() + " and atomic weight " + getAtomicWeight() + ". Metals are good conductors of electricity.");
    }
}
