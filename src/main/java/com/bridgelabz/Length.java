package com.bridgelabz;

public class Length {
    private static final double FEET_TO_INCH = 12.0;
    private static final double YARD_TO_FEET = 3.0;
    private final double value;
    public Unit unit;

   // enum Unit{ FEET,INCH,YARD }

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
    public boolean compare(Length that) {
            double value1=this.unit.getBaseValue()*this.value;
        double value2=that.unit.getBaseValue()*that.value;
        return Double.compare(value1,value2)==0;
    }
    public double addValue(Length that) {
        double value1=this.unit.getBaseValue()*this.value;
        double value2=that.unit.getBaseValue()*that.value;
        return value1+value2;
    }

}
