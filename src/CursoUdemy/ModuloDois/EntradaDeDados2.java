package CursoUdemy.ModuloDois;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        int n1 = leia.nextInt();        //age
        leia.nextLine();
        String name = leia.nextLine();  //name
        char gender = leia.next().charAt(0); //character

        //define o tipo da variavel
        String s = leia.next();
        //atribui o valor do string a variavel letter somente a letra na posição 0
        char letter = s.charAt(0);
        //atribui o digito na posicao 1 do string a variavel int com o integer.parseInt
        int digit = Integer.parseInt(s.substring(1));
        double n2 = leia.nextDouble();
        //Maria F 23 1.68

        String nome = leia.next();
        char genero = leia.next().charAt(0);
        int idade = leia.nextInt();
        double altura = leia.nextDouble();

        System.out.println(n1);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(n2);

        System.out.println(nome);
        System.out.println(genero);
        System.out.println(idade);
        System.out.println(altura);


        leia.close();


    }
}
