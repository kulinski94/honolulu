package com.kulinski.multipleregression.rali;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kulinski on 4/25/17.
 */
public class HelpersTest {

    @Test
    public void testSubtractTwoRows(){
        double[] subtract = Helpers.subtract(new double[]{10, 5, 5}, new double[]{5, 3, 2});
        Assert.assertEquals(5, subtract[0], 0);
        Assert.assertEquals(2, subtract[1], 0);
        Assert.assertEquals(3, subtract[2], 0);
    }

    @Test
    public void testMultiplyRow(){
        double[] multiply = Helpers.multiply(2.5, new double[]{10, 5, -3});

        Assert.assertEquals(25, multiply[0], 0);
        Assert.assertEquals(12.5, multiply[1], 0);
        Assert.assertEquals(-7.5, multiply[2], 0);
    }
}
