package edu.jacob.designpattern.strategy.functionali;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public interface Discounter extends UnaryOperator<BigDecimal> {

    default Discounter combine(Discounter amount) {
        return value -> amount.apply(this.apply(value));
    }

    static Discounter christmas() {
        return amount -> amount.multiply(BigDecimal.valueOf(14.8));
    }

    static Discounter easter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.5));
    }

    static Discounter newYear() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.3));
    }

}
