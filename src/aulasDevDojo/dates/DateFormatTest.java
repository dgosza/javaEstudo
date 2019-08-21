package aulasDevDojo.dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {
    public static void main(String[] args) {
        System.out.println();

        Calendar c = Calendar.getInstance();
        DateFormat[] datef = new DateFormat[6];

        datef[0] = DateFormat.getInstance();
        datef[1] = DateFormat.getDateInstance();
        datef[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        datef[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        datef[4] = DateFormat.getDateInstance(DateFormat.LONG);
        datef[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat date : datef){
            System.out.println(date.format(c.getTime()));
        }

    }
}
