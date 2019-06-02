package studyUdemy.application;

import studyUdemy.methods.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class TriangleApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

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

        System.out.printf("Triangle X: %.2f%n", areaX);
        System.out.printf("Triangle Y: %.2f%n", areaY);

        if(areaX > areaY){
            System.out.println("X bigger than Y");
        }else{
            System.out.println("Y bigger than x");
        }

        leia.close();
    }
}
