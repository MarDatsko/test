package com.example.junit.unit;

import org.springframework.stereotype.Component;

@Component
public class DiscriminantCalculate {

    public double getDiscriminant(double a, double b, double c) {
        return  Math.sqrt(Math.pow(b, 2) - (4 * a * c));
    }

    public double getFirstRoot(double dis, double b, double a) {
        return (((-b) - dis) / (2 * a));
    }

    public double getSecondRoot(double dis, double b, double a) {
        return  (((-b) + dis) / (2 * a));
    }

    public double getDoubleRoot(double b, double a){
        return  -(b / (2 * a));
    }

}
