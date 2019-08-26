package aulasDevDojo.estudosPackages;

public class Locale {
    public static void main(String[] args) {

        java.util.Locale brazil = new java.util.Locale("pt", "br");
        java.util.Locale canada = java.util.Locale.CANADA;

        System.out.println(brazil.getDisplayCountry());
        System.out.println(brazil.getCountry());
        System.out.println(brazil.getISO3Language());

        System.out.println(canada.getDisplayCountry());
        System.out.println(canada.getCountry());
        System.out.println(canada.getISO3Language());
        System.out.println(canada.getDisplayLanguage());
        System.out.println(canada);
    }
}
