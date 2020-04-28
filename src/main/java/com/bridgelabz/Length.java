package com.bridgelabz;

public class Length {
    private final double value;
    public Unit unit;

    enum Unit{ FEET,INCH }
    public Length(double value) {
        this.value=value;
    }

    public Length(Unit unit,double value) {
        this.unit=unit;
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&  unit==length.unit;
    }

}
