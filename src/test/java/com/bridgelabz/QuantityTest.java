package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEquals() {
        QuantityMeasure feet1 = new QuantityMeasure(Unit.FEET, 0.0);
        QuantityMeasure feet2 = new QuantityMeasure(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEquals() {
        QuantityMeasure feet1 = new QuantityMeasure(Unit.FEET, 0.0);
        QuantityMeasure feet2 = new QuantityMeasure(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        QuantityMeasure inch1 = new QuantityMeasure(Unit.INCH, 0.0);
        QuantityMeasure inch2 = new QuantityMeasure(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        QuantityMeasure inch1 = new QuantityMeasure(Unit.INCH, 0.0);
        QuantityMeasure inch2 = new QuantityMeasure(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEquals() {
        QuantityMeasure feet = new QuantityMeasure(Unit.FEET, 1.0);
        QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqual() throws QuantityException {
        QuantityMeasure feet = new QuantityMeasure(Unit.FEET, 0.0);
        QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEqual() throws QuantityException {
        QuantityMeasure feet = new QuantityMeasure(Unit.FEET, 1.0);
        QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() throws QuantityException {
        QuantityMeasure feet1 = new QuantityMeasure(Unit.FEET, 1.0);
        QuantityMeasure feet2 = new QuantityMeasure(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenFeetAndFeet_ShouldReturnNull() {
        QuantityMeasure feet1 = new QuantityMeasure(Unit.FEET, 0.0);
        QuantityMeasure feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() throws QuantityException {
        QuantityMeasure feet = new QuantityMeasure(Unit.FEET, 3.0);
        QuantityMeasure yard = new QuantityMeasure(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() throws QuantityException {
        QuantityMeasure feet = new QuantityMeasure(Unit.FEET, 1.0);
        QuantityMeasure yard = new QuantityMeasure(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompare_ShouldReturnNotEqual() throws QuantityException {
        QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 1.0);
        QuantityMeasure yard = new QuantityMeasure(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompare_ShouldReturnEqual() throws QuantityException {
        QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 36.0);
        QuantityMeasure yard = new QuantityMeasure(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompare_ShouldReturnEqual() throws QuantityException {
        QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 2.0);
        QuantityMeasure centiMeters = new QuantityMeasure(Unit.CENTIMETER, 5.0);
        boolean inchToCm = inch.compare(centiMeters);
        Assert.assertTrue(inchToCm);
    }

    @Test
    public void given2InchAddWith2Inch_ShouldReturn4Inch() throws QuantityException {
        QuantityMeasure inch1 = new QuantityMeasure(Unit.INCH, 2.0);
        QuantityMeasure inch2 = new QuantityMeasure(Unit.INCH, 2.0);
        double total = inch1.addValue(inch2);
        Assert.assertEquals(4.0, total, 0.0);
    }

    @Test
    public void given1FeetAdd2Inch_ShouldReturn14Inch() throws QuantityException {
        QuantityMeasure feet1 = new QuantityMeasure(Unit.FEET, 1.0);
        QuantityMeasure inch2 = new QuantityMeasure(Unit.INCH, 2.0);
        double total = feet1.addValue(inch2);
        Assert.assertEquals(14.0, total, 0.0);
    }

    @Test
    public void given2InchAddWith2Point5Centimeter_ShouldReturn3Inch() throws QuantityException {
        QuantityMeasure inch1 = new QuantityMeasure(Unit.INCH, 2.0);
        QuantityMeasure cm1 = new QuantityMeasure(Unit.CENTIMETER, 2.5);
        double total = inch1.addValue(cm1);
        Assert.assertEquals(3.0, total, 0.0);
    }

    @Test
    public void given1GallonAnd3point78Liters_WhenCompare_ShouldReturnEqual() throws QuantityException {
        QuantityMeasure gallon = new QuantityMeasure(Unit.GALLON, 1.0);
        QuantityMeasure litter = new QuantityMeasure(Unit.LITTER, 3.78);
        boolean compareCheck = gallon.compare(litter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitersAnd1000MiliLitter_WhenCompare_ShouldReturnEqual() throws QuantityException {
        QuantityMeasure litre = new QuantityMeasure(Unit.LITTER, 1.0);
        QuantityMeasure miliLitre = new QuantityMeasure(Unit.MILLI_LITTER, 1000.0);
        boolean compareCheck = litre.compare(miliLitre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAdding3Point78Litres_ShouldReturn7point56Litres() throws QuantityException {
        QuantityMeasure gallon = new QuantityMeasure(Unit.GALLON, 1.0);//3.78
        QuantityMeasure litre = new QuantityMeasure(Unit.LITTER, 3.78);//3.78
        double total = gallon.addValue(litre);
        Assert.assertEquals(7.56, total, 0.0);
    }

    @Test
    public void given1LitreAdding1000MiliLitres_ShouldReturn2Litres() throws QuantityException {
        QuantityMeasure litre = new QuantityMeasure(Unit.LITTER, 1.0);//1.0
        QuantityMeasure mililitre = new QuantityMeasure(Unit.MILLI_LITTER, 1000.0);//1.0
        double total = litre.addValue(mililitre);
        Assert.assertEquals(2.0, total, 0.0);
    }

    @Test
    public void given1kgAnd1000Gram_WhenCompare_ShouldReturnEqual() throws QuantityException {
        QuantityMeasure kiloGrams = new QuantityMeasure(Unit.KILOGRAM, 1.0);
        QuantityMeasure grams = new QuantityMeasure(Unit.GRAMS, 1000.0);
        boolean compareCheck = kiloGrams.compare(grams);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000KiloGram_WhenCompare_ShouldReturnEqual() throws QuantityException {
        QuantityMeasure tonne = new QuantityMeasure(Unit.TONNE, 1.0);
        QuantityMeasure kiloGrams = new QuantityMeasure(Unit.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kiloGrams);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAdding1000Grams_ShouldReturn1001Kilograms() throws QuantityException {
        QuantityMeasure tonne = new QuantityMeasure(Unit.TONNE, 1.0);//1.0
        QuantityMeasure grams = new QuantityMeasure(Unit.GRAMS, 1000.0);//1.0
        double total = tonne.addValue(grams);
        Assert.assertEquals(1001.0, total, 0.0);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_shouldReturnEqual() throws QuantityException {
        QuantityMeasure fahrenheit = new QuantityMeasure(Unit.FAHRENHEIT, 212.0);
        QuantityMeasure celcius = new QuantityMeasure(Unit.CELCIUS, 100.0);
        boolean equality = fahrenheit.compare(celcius);
        Assert.assertTrue(equality);
    }

    @Test
    public void givenInchAndKG_shouldReturnCustomException() {
        try {
            QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 1.0);
            QuantityMeasure kiloGram = new QuantityMeasure(Unit.KILOGRAM, 1.0);
            boolean equality = inch.compare(kiloGram);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void givenNULLAnd1Kilogram_shouldReturnCustomException() {
        try {
            QuantityMeasure unit = new QuantityMeasure(null, 1.0);
            QuantityMeasure kiloGram = new QuantityMeasure(Unit.KILOGRAM, 1.0);
            boolean equality = unit.compare(kiloGram);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.NULL_EXCEPTION, e.type);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------
    @Test
    public void given0FeetAnd0Litre_ShouldReturnEqual() {
        try {
            QuantityMeasure feet = new QuantityMeasure(Unit.FEET, 0.0);
            QuantityMeasure litre = new QuantityMeasure(Unit.LITTER, 0.0);
            boolean compareCheck = feet.compare(litre);
            Assert.assertTrue(compareCheck);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT_TYPE, e.type);
        }
    }

        @Test
    public void given1KilogramAnd0Inch_ShouldReturnNotEqual() {
            try {
                QuantityMeasure kiloGram = new QuantityMeasure(Unit.KILOGRAM, 1.0);
                QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 1.0);
                boolean compareCheck = kiloGram.compare(inch);
                Assert.assertFalse(compareCheck);
            } catch (QuantityException e) {
                Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT_TYPE, e.type);
            }
        }

            @Test
    public void given1CelciusAnd1Feet_WhenCompared_ShouldReturnEqualLength()  {
       try {
           QuantityMeasure celcius = new QuantityMeasure(Unit.CELCIUS, 1.0);
           QuantityMeasure feet2 = new QuantityMeasure(Unit.FEET, 1.0);
           boolean compareCheck = celcius.compare(feet2);
           Assert.assertTrue(compareCheck);
       } catch (QuantityException e) {
           Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT_TYPE, e.type);
       }
            }

    @Test
    public void given3KiloGramAnd1Yard_WhenCompared_ShouldReturnEqual(){
        try {
            QuantityMeasure kiloGram = new QuantityMeasure(Unit.KILOGRAM, 3.0);
            QuantityMeasure yard = new QuantityMeasure(Unit.YARD, 1.0);
            boolean compareCheck = kiloGram.compare(yard);
            Assert.assertTrue(compareCheck);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1FeetAnd1Centimeter_ShouldReturnNotEqual() throws QuantityException {
        QuantityMeasure feet = new QuantityMeasure(Unit.FEET, 1.0);
        QuantityMeasure centimeter = new QuantityMeasure(Unit.CENTIMETER, 1.0);
        boolean compareCheck = feet.compare(centimeter);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Celcius_WhenCompare_ShouldReturnNotEqual() throws QuantityException {
        try {
            QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 1.0);
            QuantityMeasure celcius = new QuantityMeasure(Unit.CELCIUS, 1.0);
            boolean compareCheck = inch.compare(celcius);
            Assert.assertFalse(compareCheck);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT_TYPE, e.type);
        }
    }

    @Test
    public void given1And36Inch_WhenCompare_ShouldReturnEqual() {
        try {
            QuantityMeasure inch = new QuantityMeasure(Unit.INCH, 36.0);
            QuantityMeasure yard = new QuantityMeasure(Unit.YARD, 1.0);
            boolean compareCheck = inch.compare(yard);
            Assert.assertTrue(compareCheck);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT_TYPE, e.type);
        }
    }

        @Test
    public void given2LitreAnd5Centimeter_WhenCompare_ShouldReturnEqual()  {
        try {
            QuantityMeasure inch = new QuantityMeasure(Unit.LITTER, 2.0);
            QuantityMeasure centiMeters = new QuantityMeasure(Unit.CENTIMETER, 5.0);
            boolean inchToCm = inch.compare(centiMeters);
            Assert.assertTrue(inchToCm);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT_TYPE, e.type);
        }
    }

        @Test
    public void given2FahrenheitAddWith2Inch_ShouldReturn4Inch() {
        try {
            QuantityMeasure fahrenheit = new QuantityMeasure(Unit.FAHRENHEIT, 2.0);
            QuantityMeasure inch2 = new QuantityMeasure(Unit.INCH, 2.0);
            double total = fahrenheit.addValue(inch2);
            Assert.assertEquals(4.0, total, 0.0);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.INVALID_UNIT_TYPE,e.type);
        }
    }
}


