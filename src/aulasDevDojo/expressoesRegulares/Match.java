package aulasDevDojo.expressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
    public static void main(String[] args) {

        boolean verifica = "maria".matches("(?i)Maria");
        System.out.println("É igual ? " + verifica);

        boolean verifica1 = "18a".matches("\\d\\d\\D");
        System.out.println("Tem numero ?" + verifica1);

        boolean verifica3 = "2".matches("\\d");
        System.out.println("Tem numero ?" + verifica3);

        boolean verifica4 = "a2".matches("\\w\\d");
        System.out.println("Tem letras e numeros ?" + verifica4);

        boolean verifica5 = " ".matches("\\s");
        System.out.println("Possui espaço? " + verifica5);

        boolean verifica6 = "E".matches(".");
        System.out.println("HÁ uma ocorrencia de String? " + verifica6);

        boolean verifica7 = "A3".matches("..");
        System.out.println("HÁ DUAS OCORRENCIAS DE STRING ?"+verifica7);

        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        boolean verifica8 = "99855-999".matches(cep);
        System.out.println("CEP VALIDO ?"+verifica8);

        
    }
}
