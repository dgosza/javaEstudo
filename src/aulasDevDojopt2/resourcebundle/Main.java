package aulasDevDojopt2.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));
        
        rb = ResourceBundle.getBundle("messages", new Locale ("en", "US"));
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("aka"));
        System.out.println(rb.getString("show"));

    }
}
