package aulasDevDojo.dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {

        Locale locItaly = new Locale("it", "IT");
        Locale locSuica = new Locale("it", "CH");
        Locale locIndia = new Locale("hi", "in");
        Locale locJapao = new Locale("ja");
        Locale locBR = new Locale("pt", "br");

        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar.DECEMBER, 25);

        DateFormat dfe = DateFormat.getDateInstance(DateFormat.LONG, locItaly);
        DateFormat dfe2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat dfe3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat dfe4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);
        DateFormat dfe5 = DateFormat.getDateInstance(DateFormat.FULL, locBR);
        DateFormat dfe15 = DateFormat.getDateInstance(DateFormat.FULL);


        System.out.println(dfe.format(c.getTime()));
        System.out.println(dfe2.format(c.getTime()));
        System.out.println(dfe3.format(c.getTime()));
        System.out.println(dfe4.format(c.getTime()));
        System.out.println(dfe5.format(c.getTime()));

        System.out.println("ZAAAAAA"+dfe.format(c.get(Calendar.HOUR)));

        System.out.println(Locale.FRANCE.getDisplayName());
        System.out.println(Locale.CANADA.getDisplayName());
        System.out.println(Locale.CANADA.getDisplayLanguage());
        System.out.println(Locale.CANADA.getCountry());

    }
}
