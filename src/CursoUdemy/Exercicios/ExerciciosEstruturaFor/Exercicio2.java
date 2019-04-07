package CursoUdemy.Exercicios.ExerciciosEstruturaFor;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite quantas vezes se repetira");
        int in = 0, out = 0;
        int rep = leia.nextInt();

        for(int i = 1; i<=rep; i++){
            System.out.println("Digite o "+i+"° numero");
            int number = leia.nextInt();

            if(number>=10 && number<=20){
                in += 1;
            }else{
                out += 1;
            }
        }

        System.out.println(in+" in");
        System.out.println(out+" out");

        leia.close();
    }
}
