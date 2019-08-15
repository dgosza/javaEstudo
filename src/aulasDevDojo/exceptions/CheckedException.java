package aulasDevDojo.exceptions;

import java.io.File;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {

        Object o = null;

        try {
            int[] a = new int[2];
            System.out.println(a[2]);
            System.out.println("Imprimindo depois da possivel excecao");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Fora do bloco try catch");
    }

}
