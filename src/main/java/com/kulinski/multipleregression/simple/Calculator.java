package com.kulinski.multipleregression.simple;

import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    public static Result gaussMethod(List<Equation> equations){
        List<Equation> sorted = sortByPivot(equations);
        divideByPivot(0, sorted);
        sumRows(0, 1, sorted);

        double resultY = sorted.get(1).calculateY(0, 0);
        double resultX = sorted.get(0).calculateX(0, resultY);

        System.out.println("X: " + resultX);
        System.out.println("Y: " + resultY);

        return new Result(resultX, resultY, 0);
    }

    private static void sumRows(int pivotIndex, int indexToSum, List<Equation> sorted) {
        Equation secondRow = sorted.get(indexToSum);
        Equation multiply = sorted.get(pivotIndex).multiply(-secondRow.x);
        sorted.set(indexToSum, secondRow.plus(multiply));
    }

    private static Equation divideByPivot(int index, List<Equation> sorted) {
        Equation divide = sorted.get(index).divide(sorted.get(index).x);

        sorted.set(index, divide);
        return divide;
    }

    private static List<Equation> sortByPivot(List<Equation> equations) {
        return equations.stream().sorted((regression, t1) -> Double.compare(t1.x, regression.x)).collect(Collectors.toList());
    }
}
