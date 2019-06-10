package studyUdemy.exercicioFixacaoVetor;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = leia.nextInt();
        Quarto[] rooms = new Quarto[10];

        for (int i = 1; i <= n; i++) {
            System.out.print("\n\nRent #" + i + ":");
            System.out.print("Name: ");
            String name = leia.next();
            System.out.print("Email: ");
            String email = leia.next();
            System.out.print("Room: ");
            int room  = leia.nextInt();
            rooms[room] = new Quarto(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i<n; i++){
            if(rooms[i] != null){
                System.out.print(i);
                System.out.print(rooms[i]);
            }
        }


        leia.close();
    }
}
