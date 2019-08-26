package aulasDevDojo.estudosPackages;

import java.util.Calendar;
import java.util.Locale;

public class CalendarEstudo {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("CALENDAR GETMAXIMUM");
        System.out.println(calendar.getTime());
        System.out.println(calendar.getMaximum(Calendar.MINUTE));
        System.out.println(calendar.getMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getMaximum(Calendar.DAY_OF_YEAR));

        System.out.println("CALENDAR ADD");
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE, -14 );
        calendar.add(Calendar.MONTH, 2);
        System.out.println("15 days ago and two month later: " + calendar.getTime());

        System.out.println("CALENDAR SET");
        System.out.println("Mes atual: " + calendar.get(Calendar.MONTH));
        calendar.set(Calendar.MONTH, 1);                                    
        System.out.println("Mes de janeiro " + calendar.get(Calendar.MONTH));
        System.out.println("CALENDAR GET LEAST MAXIMUM");

        System.out.println();    
        
    }
}
