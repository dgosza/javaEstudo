package CursoUdemy.ModuloDois;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = leia.nextLine();

        System.out.println("How many bedrooms are there in your house ?");
        int bed = leia.nextInt();

        System.out.println("Enter Product price");
        double price = leia.nextDouble();

        System.out.println("Enter your last name, age and height(same line)");
        String last = leia.next();
        int age = leia.nextInt();
        double altura = leia.nextDouble();


        System.out.println(name);
        System.out.println(bed);
        System.out.println(price);
        System.out.println(last);
        System.out.println(age);
        System.out.println(altura);

    }
}
