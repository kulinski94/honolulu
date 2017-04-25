package com.kulinski.multipleregression.rali;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Created by kulinski on 4/22/17.
 */
public class Result {

    public double b0;
    public double b1;
    public double b2;
    public double b3;

    public Result(double b0, double b1, double b2, double b3) {
        this.b0 = b0;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
