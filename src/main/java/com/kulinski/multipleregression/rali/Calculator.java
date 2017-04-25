package com.kulinski.multipleregression.rali;


import java.util.List;

import static com.kulinski.multipleregression.rali.Helpers.*;

/**
 * Created by kulinski on 4/24/17.
 */
public class Calculator {

    public static Result calculate(List<Equation> rows) {
        double[][] matrix = makeMatrix(rows);

        printMatrix(matrix);
        diagonalize(matrix);
        printMatrix(matrix);
        return solve(matrix);
    }

    private static void diagonalize(double[][] matrix) {
        for (int row = 1; row < matrix.length; row++) {
            matrix[row] = subtract(multiply(matrix[0][0], matrix[row]), multiply(matrix[0][row], matrix[0]));
        }
        for (int row = 2; row < matrix.length; row++) {
            matrix[row] = subtract(multiply(matrix[1][1], matrix[row]), multiply(matrix[1][row], matrix[1]));
        }
        for (int row = 3; row < matrix.length; row++) {
            matrix[row] = subtract(multiply(matrix[2][2], matrix[row]), multiply(matrix[2][row], matrix[2]));
        }
    }

    private static Result solve(double[][] matrix) {
        double b3 = matrix[3][4] / matrix[3][3];
        double b2 = (matrix[2][4] - b3 * matrix[2][3]) / matrix[2][2];
        double b1 = (matrix[1][4] - b3 * matrix[1][3] - b2 * matrix[1][2]) / matrix[1][1];
        double b0 = (matrix[0][4] - b3 * matrix[0][3] - b2 * matrix[0][2] - b1 * matrix[0][1]) / matrix[0][0];
        return new Result(b0, b1, b2, b3);
    }


}
