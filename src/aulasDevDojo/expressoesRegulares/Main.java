package aulasDevDojo.expressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // \d = todos os digitos
        // \D = tudo que nao for digito
        // \s = espacos em brancos
        // \S = caractereque nao é branco

        String regex = "\\D";
        String texto = "diegosouza123magalhaes3";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicies encontradas");
        while(matcher.find()){
            System.out.print(matcher.start() + " ");
        }
    }
}

