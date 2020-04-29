package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnEquals() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEquals() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH, 0.0);
        Length inch2 = new Length(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEquals() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet = new Length(Unit.FEET, 0.0);
        Length inch = new Length(Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEqualLength() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length inch = new Length(Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualLength() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length feet2 = new Length(Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenFeetAndFeet_ShouldReturnNull() {
        Length feet1 = new Length(Unit.FEET, 0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqual() {
        Length feet = new Length(Unit.FEET, 3.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnNotEqual() {
        Length feet = new Length(Unit.FEET, 1.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompare_ShouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH, 1.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_WhenCompare_ShouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 36.0);
        Length yard = new Length(Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenCompare_ShouldReturnEqual() {
        Length inch = new Length(Unit.INCH, 2.0);
        Length cm = new Length(Unit.CENTIMETER, 5.0);
        boolean inchToCm = inch.compare(cm);
        Assert.assertTrue(inchToCm);
    }

    @Test
    public void given2InchAddWith2Inch_ShouldReturn4Inch() {
        Length inch1 = new Length(Unit.INCH, 2.0);
        Length inch2 = new Length(Unit.INCH, 2.0);
        double total = inch1.addValue(inch2);
        Assert.assertEquals(4.0, total, 0.0);
    }

    @Test
    public void given1FeetAdd2Inch_ShouldReturn14Inch() {
        Length feet1 = new Length(Unit.FEET, 1.0);
        Length inch2 = new Length(Unit.INCH, 2.0);
        double total = feet1.addValue(inch2);
        Assert.assertEquals(14.0, total, 0.0);
    }

    @Test
    public void given2InchAddWith2Point5Centimeter_ShouldReturn3Inch() {
        Length inch1 = new Length(Unit.INCH, 2.0);
        Length cm1 = new Length(Unit.CENTIMETER, 2.5);
        double total = inch1.addValue(cm1);
        Assert.assertEquals(3.0, total, 0.0);
    }

    @Test
    public void given1GallonAnd3point78Liters_WhenCompare_ShouldReturnEqual() {
        Length gallon = new Length(Unit.GALLON, 1.0);
        Length litter = new Length(Unit.LITTER, 3.78);
        boolean compareCheck = gallon.compare(litter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitersAnd1000MiliLitter_WhenCompare_ShouldReturnEqual() {
        Length litre = new Length(Unit.LITTER, 1.0);
        Length miliLitre = new Length(Unit.MILILITTER, 1000.0);
        boolean compareCheck = litre.compare(miliLitre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAdding3Point78Litres_ShouldReturn7point57Litres() {
        Length gallon = new Length(Unit.GALLON, 1.0);//3.78
        Length litre = new Length(Unit.LITTER, 3.78);//3.78
        double total = gallon.addValue(litre);
        Assert.assertEquals(7.57, total, 0.0);
    }
    @Test
    public void given1LitreAdding1000MiliLitres_ShouldReturn2Litres() {
        Length litre = new Length(Unit.LITTER, 1.0);//1.0
        Length mililitre = new Length(Unit.MILILITTER, 1000.0);//1.0
        double total = litre.addValue(mililitre);
        Assert.assertEquals(2.0, total, 0.0);
    }
    @Test
    public void given1kgAnd1000Gram_WhenCompare_ShouldReturnEqual() {
        Length kiloGrams = new Length(Unit.KILOGRAM, 1.0);
        Length grams = new Length(Unit.GRAMS, 1000.0);
        boolean compareCheck = kiloGrams.compare(grams);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1TonneAnd1000KiloGram_WhenCompare_ShouldReturnEqual() {
        Length tonne = new Length(Unit.TONNE, 1.0);
        Length kiloGrams = new Length(Unit.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kiloGrams);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1TonneAdding1000Grams_ShouldReturn1001Kilograms() {
        Length tonne = new Length(Unit.TONNE, 1.0);//1.0
        Length grams = new Length(Unit.GRAMS, 1000.0);//1.0
        double total = tonne.addValue(grams);
        Assert.assertEquals(1001.0, total, 0.0);
    }

}


