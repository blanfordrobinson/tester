package tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by blanfordrobinson on 4/18/2016.
 */
public class TestLocalDateTime {

    protected static final DateFormat DATE_FORMATTER = new SimpleDateFormat("MM/yyyy");

    public static void main (String[] args) {


        LocalDateTime feb29_2014 = LocalDateTime.of(2016, Month.APRIL, 1, 0, 0);


        Date ds = Date.from(feb29_2014.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println("=============================> d " + ds);

        Date d = null;

        try{
            d = DATE_FORMATTER.parse( ds.toString() );
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }


        System.out.println("=============================> d " + d);

    }


}
