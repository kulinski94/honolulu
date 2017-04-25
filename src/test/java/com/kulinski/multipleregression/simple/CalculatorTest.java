package com.kulinski.multipleregression.simple;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kulinski on 4/22/17.
 */
public class CalculatorTest {

    @Test
    public void testSimpleGauss(){
        List<Equation> test = new ArrayList<>();
        test.add(new Equation(2, 3, 8));
        test.add(new Equation( 3, 6, 15));

        Result result = Calculator.gaussMethod(test);

        Assert.assertEquals(result.resultX, 1, 0);
        Assert.assertEquals(result.resultY, 2, 0);
    }


    public void testHistoricData(){
        List<Equation> historicalData = new ArrayList<>();
//        historicalData.add(new Equation(1.142, 1.060, 325, 201));
//        historicalData.add(new Equation(863, 995, 98, 98));
//        historicalData.add(new Equation(863, 995, 98, 98));
//        historicalData.add(new Equation(1.065, 3.205, 23, 162));
//        historicalData.add(new Equation(554, 120, 0, 54));
//        historicalData.add(new Equation(983, 2.897, 120, 138));
//        historicalData.add(new Equation(256, 485, 88, 61));

        Result result = Calculator.gaussMethod(historicalData);

        Assert.assertEquals(result.resultX, 1, 0);
        Assert.assertEquals(result.resultY, 2, 0);
    }
}
