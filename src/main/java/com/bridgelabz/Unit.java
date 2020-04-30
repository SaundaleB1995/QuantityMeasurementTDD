package com.bridgelabz;

public enum Unit {
    FEET(12.0,UnitType.LENGTH), YARD(36.0,UnitType.LENGTH), INCH(1.0,UnitType.LENGTH),CENTIMETER(1D/2.5,UnitType.LENGTH),
    GALLON(3.78,UnitType.VOLUME),LITTER(1.0,UnitType.VOLUME),MILLI_LITTER(0.001,UnitType.VOLUME) ,
    KILOGRAM (1.0,UnitType.WEIGHT),GRAMS (0.001,UnitType.WEIGHT),TONNE(1000.0,UnitType.WEIGHT),
    FAHRENHEIT(100.0,UnitType.TEMPERATURE),CELCIUS(212.0,UnitType.TEMPERATURE) ;

    private final UnitType unitType;
    private double baseValue;

    Unit(double baseValue,UnitType unitType) {
        this.baseValue=baseValue;
        this.unitType=unitType;
    }

     double getBaseValue() {
        return this.baseValue;
    }

     UnitType getUnitType() {
        return unitType;
    }
}
