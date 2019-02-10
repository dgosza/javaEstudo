package ModuloDois;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int n1 = leia.nextInt();

       if(n1<12){
           System.out.println("Bom dia!");
       }else if(n1 < 18){
           System.out.println("Boa tarde");
       }else{
           System.out.println("Bom noite!");
       }
    }
}
