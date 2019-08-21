package aulasDevDojo.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MainDate {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date.getTime());
        System.out.print("Horas: " + date.getHours() + ":");
        System.out.print(date.getMinutes());
        System.out.println();
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        System.out.println(Calendar.JANUARY);
        System.out.println(c);


    }
}
