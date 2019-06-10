package studyUdemy.application;

import studyUdemy.methods.Vetores2;

import java.util.Locale;
import java.util.Scanner;

public class Vetores2Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = leia.nextInt();
        Vetores2[] vetor = new Vetores2[n];

        for (int i = 0; i < n; i++) {
            leia.nextLine();
            String name = leia.nextLine();
            double price = leia.nextDouble();
            vetor[i] = new Vetores2(name, price);
        }
        double soma = 0.0;
        for(int i = 0 ; i<n; i++){
            soma = vetor[i].getPrice();
        }


        System.out.println("Media dos produtos " + soma / n);

        leia.close();
    }
}
