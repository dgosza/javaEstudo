package CursoUdemy.OrientacaoObjeto.Modulo1.application;

import CursoUdemy.OrientacaoObjeto.Modulo1.entities.ProgramMetodo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = ProgramMetodo.circumference(radius);
        double v = ProgramMetodo.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", ProgramMetodo.PI);

        sc.close();
    }


}

