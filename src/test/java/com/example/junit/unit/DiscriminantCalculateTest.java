package com.example.junit.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscriminantCalculateTest {

    DiscriminantCalculate discriminantCalculate = new DiscriminantCalculate();

    @Test
    void getDiscriminant() {
        double a = 1.0;
        double b = 8.0;
        double c = 15.0;
        double expectedResult = 2.0;

        double discriminant = discriminantCalculate.getDiscriminant(a, b, c);

        assertTrue(discriminant >= 0.0);
        assertEquals(expectedResult,discriminant);
    }

    @Test
    void getFirstRoot() {
        double dis = 2.0;
        double a = 1.0;
        double b = 8.0;
        double expectedResult = -5.0;

        double firstRoot = discriminantCalculate.getFirstRoot(dis, b, a);

        assertEquals(expectedResult,firstRoot);
    }

    @Test
    void getSecondRoot() {
        double dis = 2.0;
        double a = 1.0;
        double b = 8.0;
        double expectedResult = -3.0;

        double secondRoot = discriminantCalculate.getSecondRoot(dis, b, a);

        assertEquals(expectedResult,secondRoot);
    }

    @Test
    void getDoubleRoot() {
        double a = 1.0;
        double b = 18.0;
        double expectedResult = -9.0;

        double doubleRoot = discriminantCalculate.getDoubleRoot(b, a);

        assertEquals(expectedResult,doubleRoot);
    }
}