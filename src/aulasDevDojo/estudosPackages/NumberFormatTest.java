package aulasDevDojo.estudosPackages;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {

        Locale brazil = new Locale("pt", "br");
        Locale canada = Locale.CANADA;
        NumberFormat nf = NumberFormat.getCurrencyInstance(canada);
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(brazil);
        double number = 3123.312;

        System.out.println(nf.format(number));
        System.out.println(nf1.format(number));

    }
}
