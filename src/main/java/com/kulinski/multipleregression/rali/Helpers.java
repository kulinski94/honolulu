package com.kulinski.multipleregression.rali;

import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 * Created by kulinski on 4/24/17.
 */
public class Helpers {

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static double[] subtract(double[] row1, double[] row2) {
        double[] result = new double[row1.length];
        for (int i = 0; i < row1.length; i++) {
            result[i] = row1[i]- row2[i];
        }
        return result;
    }

    public static double[] multiply(double multiply, double[] row) {
        double[] result = new double[row.length];
        for (int i = 0; i < row.length; i++) {
            result[i] = row[i]*multiply;
        }
        return result;
    }

    public static double[][] makeMatrix(List<Equation> rows) {
        return new double[][]{
                row1(rows),
                row2(rows),
                row3(rows),
                row4(rows)
        };
    }

    public static double[] row4(List<Equation> rows) {
        return new double[]{
                sum(rows, equation -> equation.y),
                sum(rows, equation -> equation.y * equation.w),
                sum(rows, equation -> equation.y * equation.x),
                sum(rows, equation -> equation.y * equation.y),
                sum(rows, equation -> equation.z * equation.y),
        };
    }

    public static double[] row3(List<Equation> rows) {
        return new double[]{
                sum(rows, equation -> equation.x),
                sum(rows, equation -> equation.x * equation.w),
                sum(rows, equation -> equation.x * equation.x),
                sum(rows, equation -> equation.y * equation.x),
                sum(rows, equation -> equation.z * equation.x),
        };
    }

    public static double[] row2(List<Equation> rows) {
        return new double[]{
                sum(rows, equation -> equation.w),
                sum(rows, equation -> equation.w * equation.w),
                sum(rows, equation -> equation.x * equation.w),
                sum(rows, equation -> equation.y * equation.w),
                sum(rows, equation -> equation.z * equation.w),
        };
    }

    public static double[] row1(List<Equation> rows) {
        return new double[]{
                rows.size(),
                sum(rows, equation -> equation.w),
                sum(rows, equation -> equation.x),
                sum(rows, equation -> equation.y),
                sum(rows, equation -> equation.z),
        };
    }

    private static double sum(List<Equation> rows, ToDoubleFunction<Equation> equationToDoubleFunction) {
        return rows.stream().mapToDouble(equationToDoubleFunction).sum();
    }
}
