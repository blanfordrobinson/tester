package tests;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by blanfordrobinson on 4/19/2016.
 */
public class TestBigDecimal {

    public static void main (String[] args) {

        BigDecimal bd1 = new BigDecimal(12041035201.40422375128);
        BigDecimal bd2 = new BigDecimal(23278935482.64143187280);

        System.out.println("=========================> " + bd1.divide(bd2, 2, RoundingMode.HALF_UP));


        Double x = 0.0000;
        System.out.println("==========================> d " + x);

        BigDecimal bd3 = new BigDecimal(x);

        System.out.println("======================> " + bd3);

        System.out.println("======================> " + BigDecimal.ZERO);

        if (bd3.equals(BigDecimal.ZERO)){
            System.out.println("===================>  WHY");

        }

    }
}
