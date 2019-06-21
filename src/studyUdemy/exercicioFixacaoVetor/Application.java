package studyUdemy.exercicioFixacaoVetor;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        Quarto quartos = new Quarto();
        int[] quartosOn = new int[10];

        System.out.println("Hoy many rooms will be rented?");
        int numRoomsRented = leia.nextInt();

        for(int i = 0; i<=numRoomsRented; i++){
            System.out.print("Name: \n");
            quartos.setName(leia.next());

            System.out.println("Email: \n");
            quartos.setEmail(leia.next());

            System.out.println("Room: \n");
            quartos.setRoom(leia.nextInt());

        }



        leia.close();
    }
}
