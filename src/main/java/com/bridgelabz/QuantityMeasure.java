package com.bridgelabz;

public class QuantityMeasure {
    private final double value;
    public Unit unit;

    public QuantityMeasure(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasure length = (QuantityMeasure) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

    public boolean compare(QuantityMeasure that) throws QuantityException {
        try {
            if (this.unit.getUnitType().equals(that.unit.getUnitType())) {
                double value1 = this.unit.getBaseValue() * this.value;//1.0
                double value2 = that.unit.getBaseValue() * that.value;//1.0
                return Double.compare(value1, value2) == 0;
            }
            throw new QuantityException(QuantityException.ExceptionType.INVALID_UNIT_TYPE, "invalid Unit Type");
        } catch (NullPointerException e) {
            throw new QuantityException(QuantityException.ExceptionType.NULL_EXCEPTION, "Null Exception");

        }
    }

    public double addValue(QuantityMeasure that) throws QuantityException {
        try {
            if (this.unit.getUnitType().equals(that.unit.getUnitType())) {
                double value1 = this.unit.getBaseValue() * this.value;
                double value2 = that.unit.getBaseValue() * that.value;
                return value1 + value2;
            }
            throw new QuantityException(QuantityException.ExceptionType.INVALID_UNIT_TYPE, "Invalid Unit Type");
        } catch (NullPointerException e) {
            throw new QuantityException(QuantityException.ExceptionType.NULL_EXCEPTION, "Null Exception");
        }
    }
}