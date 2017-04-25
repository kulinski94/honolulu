package com.kulinski.multipleregression.simple;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Created by kulinski on 4/22/17.
 */
public class Equation {

    double x;
    double y;
    double z;

    public Equation(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Equation divide(double div) {
        return new Equation(x / div, y / div, z / div);

    }

    public Equation multiply(double param) {
        return new Equation(x * param, y * param, z * param);
    }

    public Equation plus(Equation plus) {
        return new Equation(x + plus.x, y + plus.y, z + plus.z);
    }

    public double calculateY(double resultW, double resultX) {
        return (z - this.x * resultX) / y;
    }

    public double calculateX(double resultW, double resultY) {
        return (z - this.y * resultY) / x;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
