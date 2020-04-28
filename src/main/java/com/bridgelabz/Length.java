package com.bridgelabz;

public class Length {
    private static final double FEET_TO_INCH = 12.0;
    private static final double YARD_TO_FEET = 3.0;
    private final double value;
    public Unit unit;

    enum Unit{ FEET,INCH,YARD }

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
        if (this.unit.equals(Unit.FEET)&&that.unit.equals(Unit.FEET))
            return Double.compare(this.value,that.value)==0;
        if (this.unit.equals(Unit.FEET)&&that.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH,that.value)==0;

        if (this.unit.equals(unit.FEET)&& that.unit.equals(Unit.YARD))
            return Double.compare(this.value,that.value*YARD_TO_FEET)==0;
        return false;
    }

}
