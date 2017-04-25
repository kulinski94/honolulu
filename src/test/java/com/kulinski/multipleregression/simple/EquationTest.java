package com.kulinski.multipleregression.simple;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kulinski on 4/23/17.
 */
public class EquationTest {

    @Test
    public void testMultiply(){
        Equation equation = new Equation(3, 4, 5);
        Equation multiply = equation.multiply(2);

        Assert.assertEquals(multiply.x, 6 , 0);
        Assert.assertEquals(multiply.y, 8 , 0);
        Assert.assertEquals(multiply.z, 10 , 0);
    }

    @Test
    public void testPlus(){
        Equation equation = new Equation( 3, 4, 5);
        Equation result = equation.plus(new Equation(-5, 8, -12));

        Assert.assertEquals(result.x, -2 , 0);
        Assert.assertEquals(result.y, 12 , 0);
        Assert.assertEquals(result.z, -7 , 0);
    }

    @Test
    public void testDivide(){
        Equation equation = new Equation(3, 4, 5);
        Equation result = equation.divide(2);

        Assert.assertEquals(result.x, 1.5 , 0);
        Assert.assertEquals(result.y, 2 , 0);
        Assert.assertEquals(result.z, 2.5 , 0);
    }
}
