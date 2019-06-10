package studyUdemy.application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva um numero para guardar as notas");
        int n = leia.nextInt();
        double[] vetor = new double[n];

        for(int i = 0; i<n; i++){
            vetor[i] = leia.nextDouble();
        }

        double somadoVetor = 0.0;
        for(int i = 0; i<n; i++){
            somadoVetor += vetor[i];
        }
        double media = somadoVetor / n;
        System.out.println(media);

        leia.close();
    }
}
