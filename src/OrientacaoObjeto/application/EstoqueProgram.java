package OrientacaoObjeto.application;

import OrientacaoObjeto.entities.Estoque;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        Scanner leia = new Scanner(System.in);
        Estoque produto = new Estoque();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        produto.name = leia.next();

        System.out.print("Price: ");
        produto.price = leia.nextDouble();

        System.out.print("Quantity in stock: ");
        produto.quantity = leia.nextInt();

        System.out.println("Product data:"+produto);

        System.out.print("Enter the number of products to be added in stock: ");
        int add = leia.nextInt();
        produto.addProducts(add);

        System.out.println("Updated data:"+produto);

        System.out.print("Enter the number of products to be removed from stock: ");
        int remove = leia.nextInt();
        produto.removeProducts(remove);

        System.out.println("Updated data: "+produto);

        leia.close();

    }
}
