package com.bridgelabz;

public enum Unit {
    FEET(12.0), YARD(36.0), INCH(1.0),CENTIMETER(1D/2.5) ;
    private double baseValue;

    Unit(double baseValue) {
        this.baseValue=baseValue;
    }

    public double getBaseValue() {
        return this.baseValue;
    }
}
