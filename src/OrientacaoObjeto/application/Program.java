package OrientacaoObjeto.application;

import OrientacaoObjeto.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.a = leia.nextDouble();
        x.b = leia.nextDouble();
        x.c = leia.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        y.a = leia.nextDouble();
        y.b = leia.nextDouble();
        y.c = leia.nextDouble();


        double areaX = x.calculaArea();
        double areaY = y.calculaArea();

        System.out.printf("OrientacaoObjeto.entities.Triangle X area: %.4f%n", areaX);
        System.out.printf("OrientacaoObjeto.entities.Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

        leia.close();
    }
}
