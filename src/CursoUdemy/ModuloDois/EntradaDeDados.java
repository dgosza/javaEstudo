package CursoUdemy.ModuloDois;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        String sentence = leia.nextLine();
        String x, y, z;

        x = leia.next();
        z = leia.next();
        y = leia.next();


        System.out.println(sentence);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        x = leia.next();
        z = leia.next();
        y = leia.next();

        System.out.println(x);
        System.out.println(z);
        System.out.println(y);


        leia.close();


    }

}
