package studyUdemy.application;

import studyUdemy.methods.Estoque;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.println("Enter product data:\n");
        System.out.println("Name: ");
        String name = leia.next();

        System.out.println("Price: ");
        Double price = leia.nextDouble();

        System.out.println("Quantity in stock: ");
        int quantity = leia.nextInt();


        Estoque produto = new Estoque(name, price, quantity);
        System.out.println(produto); //funçao toString


        System.out.println("Enter the number of products to be added in stock: ");
        produto.addProducts(leia.nextInt());

        System.out.println("Updated: " + produto);

        System.out.println("Enter the number of products to be removed in stock: ");
        produto.removeProducts(leia.nextInt());

        System.out.println("Updated: " + produto);

        leia.close();
    }
}
