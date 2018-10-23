package edu.jacob.designpattern.strategy.functionali;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static edu.jacob.designpattern.strategy.functionali.Discounter.christmas;
import static edu.jacob.designpattern.strategy.functionali.Discounter.easter;
import static edu.jacob.designpattern.strategy.functionali.Discounter.newYear;

public class Client8 {

    public static void main(String[] args) {
        List<Discounter> disList = Arrays.asList(christmas(), easter(), newYear());

        BigDecimal bigDecimalC = BigDecimal.valueOf(100);

        final Discounter discounter = disList
                .stream()
                .reduce(v -> v, Discounter::combine);

        discounter.apply(bigDecimalC);

        System.out.println(discounter.apply(bigDecimalC));

    }
}
