package aulasDevDojo.estudosPackages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTeste {
    public static void main(String[] args) {

        Date data  = new Date();
        SimpleDateFormat format = new SimpleDateFormat();
        SimpleDateFormat format1 = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss.SSSZ", Locale.CANADA);
        SimpleDateFormat format3 = new SimpleDateFormat("EEEEE dd MMMMM yyyy HH:mm:ss.SSSZ", Locale.FRENCH);

        System.out.println(format.format(data));
        System.out.println(format1.format(data));
        System.out.println(format3.format(data));
        System.out.println(format3.format(data));
    }
}
