package aulasDevDojo.exceptions.exemplo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static int calculaQuociente(int numerador, int denominador){
        return numerador / denominador;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);
        boolean continua = true;


        do{
            try{
                System.out.print("Numerador: ");
                int numerador = sc.nextInt();

                System.out.print("Denominador: ");
                int denominador = sc.nextInt();

                int resultador = calculaQuociente(numerador, denominador);
                System.out.println("Resultado: "+resultador);

                continua = false;

            }catch (InputMismatchException erro1) {
                System.err.print("ATENÇÃO! ");
                System.out.println("Não é permitido inserir letras, informe apenas números inteiros!");
                sc.nextLine();
                System.out.print("Erro: ");
                System.err.println(erro1);
            }catch(ArithmeticException erro2){
                System.err.print("ATENÇÃO! ");
                System.out.println("O número do divisor deve ser diferente de 0!");
            }finally {
                System.out.println("Tente novamente");
                System.out.println("Saindo do metodo...");
            }
        }while(continua);
    }
}
