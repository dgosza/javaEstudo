package studyUdemy.application;

import studyUdemy.methods.Pi;

import java.util.Locale;
import java.util.Scanner;


public class PiApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = leia.nextDouble();

        double c = Pi.circumference(radius);
        double v = Pi.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.println("PI Value: "+Pi.PI);


        leia.close();
    }
}
