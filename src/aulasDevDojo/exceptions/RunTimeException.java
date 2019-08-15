package aulasDevDojo.exceptions;

import java.io.File;
import java.io.IOException;

public class RunTimeException {
    public static void main(String[] args) {
        System.out.println();
        criarArquivo();
    }

    public static void criarArquivo(){
        File file = new File("aa.html");
        try{
            System.out.println("Arquivo Criado!");
            System.out.println("Nome do arquivo: "+file.createNewFile());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
