package aulasDevDojo.tokens;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner("1 - true 10 oi");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }

        System.out.println("#####################");

        Scanner sc1 = new Scanner("1 - true 10 oi");
        while(sc1.hasNext()){
            if(sc1.hasNextInt()){
                System.out.println("Valor inteiro: "+sc1.next());
            }else if(sc1.hasNextBoolean()){
                System.out.println("Valor Boolean: "+sc1.next());
            }else{
                System.out.println(sc1.next());
            }
        }

    }
}
