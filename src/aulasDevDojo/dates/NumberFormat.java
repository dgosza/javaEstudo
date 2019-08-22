package aulasDevDojo.dates;

import java.util.Locale;

public class NumberFormat {
    public static void main(String[] args) {

        float valor = 1234.4324f;
        Locale japao = new Locale("jp");
        Locale fr = new Locale("fr");
        java.text.NumberFormat[] nf = new java.text.NumberFormat[4];

        nf[0] = java.text.NumberFormat.getInstance();
        nf[1] = java.text.NumberFormat.getInstance(japao);
        nf[2] = java.text.NumberFormat.getCurrencyInstance();
        nf[3] = java.text.NumberFormat.getCurrencyInstance(japao);

        for(java.text.NumberFormat nfa : nf){
            System.out.println(nfa.format(valor));
        }

        java.text.NumberFormat number = java.text.NumberFormat.getInstance();
        System.out.println(number.getMinimumFractionDigits());
    }
}
