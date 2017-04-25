package com.kulinski.multipleregression.rali;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kulinski on 4/22/17.
 */
public class CalculatorTest {

    @Test
    public void blackBoxTest1(){
        List<com.kulinski.multipleregression.rali.Equation> rows = new ArrayList<>();
        rows.add(new com.kulinski.multipleregression.rali.Equation(1_142, 1_060, 325, 201));
        rows.add(new com.kulinski.multipleregression.rali.Equation(863, 995, 98, 98));
        rows.add(new com.kulinski.multipleregression.rali.Equation(1_065, 3_205, 23, 162));
        rows.add(new com.kulinski.multipleregression.rali.Equation(554, 120, 0, 54));
        rows.add(new com.kulinski.multipleregression.rali.Equation(983, 2_896, 120, 138));
        rows.add(new com.kulinski.multipleregression.rali.Equation(256, 485, 88, 61));

        Result result = Calculator.calculate(rows);
        System.out.println(result);

        Assert.assertEquals(6.7013, result.b0, 0.0001);
        Assert.assertEquals(0.0784, result.b1, 0.0001);
        Assert.assertEquals(0.0150, result.b2, 0.0001);
        Assert.assertEquals(0.2461, result.b3, 0.0001);
    }

    @Test
    public void blackBoxTest2(){
        List<com.kulinski.multipleregression.rali.Equation> rows = new ArrayList<>();
        rows.add(new com.kulinski.multipleregression.rali.Equation(345, 65, 23, 31.4));
        rows.add(new com.kulinski.multipleregression.rali.Equation(168, 18, 18, 14.6));
        rows.add(new com.kulinski.multipleregression.rali.Equation(94, 0, 0, 6.4));
        rows.add(new com.kulinski.multipleregression.rali.Equation(187, 185, 98, 28.3));
        rows.add(new com.kulinski.multipleregression.rali.Equation(621, 87, 10, 42.1));
        rows.add(new com.kulinski.multipleregression.rali.Equation(255, 0, 0, 15.3));

        Result result = Calculator.calculate(rows);
        System.out.println(result);

        Assert.assertEquals(0.56645, result.b0, 0.0001);
        Assert.assertEquals(0.06533, result.b1, 0.0001);
        Assert.assertEquals(0.008719, result.b2, 0.0001);
        Assert.assertEquals(0.15105, result.b3, 0.0001);
    }
}
