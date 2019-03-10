package OrientacaoObjeto.Modulo2.program;

import OrientacaoObjeto.Modulo2.methods.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();


        Product produto = new Product(name, price);
        sc.close();

    }
}
