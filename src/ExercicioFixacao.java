import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter N: ");
        int num = leia.nextInt();
        int maior = 0;

        while(num <1){
            System.out.print("N must be positive! Try Again: ");
            num = leia.nextInt();
        }

        for(int i = 1; i<=num; i++){
            System.out.print("Value #"+i);
            int numero = leia.nextInt();
            if(numero>maior){
                maior = numero;
            }
        }

        System.out.println("Higher = "+maior);


        leia.close();
    }
}
