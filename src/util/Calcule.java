package util;

import entities.TriangleRatios;

public class Calcule {

    public static double calculateSine(TriangleRatios ratios) {
        if (ratios.hypotenuse == 0) {
            throw new IllegalArgumentException("Hypotenuse cannot be zero.");
        }
        return ratios.opposite / ratios.hypotenuse;
    }

    public static double calculateCosine(TriangleRatios ratios) {
        if (ratios.hypotenuse == 0) {
            throw new IllegalArgumentException("Hypotenuse cannot be zero.");
        }
        return ratios.adjacent / ratios.hypotenuse;
    }

    public static double calculateTangent(TriangleRatios ratios) {
        return ratios.opposite / ratios.adjacent;
    }
}