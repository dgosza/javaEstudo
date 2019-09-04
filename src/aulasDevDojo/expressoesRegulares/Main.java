package aulasDevDojo.expressoesRegulares;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // \d = todos os digitos dentro da string
        // \D = tudo que nao for digito | encontra caracteres
        // \S = caracterer dentro da sintr que nao é espaço em branco
        // \s = busca na string caracter em branco
        // \w = busca na string caracter de palavaras
        // \W = busca na string caracter que nao eh palavra nem numero
        // "[abc]" = busca na string caracteres A  e B e C
        // "[A-Ca-c]" ou "[2-4]"
        // ? = zero ou uma
        // * = zero ou mais
        // + = uma ou mais
        // {n,n} de n ate n
        // ()
        // |
        // $


        //String regex = "0[xX]([0-9a-zA-Z])+\\W";
        //String texto = "12 0x 0X 0xFFABXC@ 0x10G@ 0x1";

        //String regex = "([A-Za-z0-9\\.-_])+@([A-Za-z0-9\\.-_])+(\\.([A-Za-z0-9])+)+";
        //String texto = "diego@gmail.com, fulano@hotmail.com.br, cicrano@yahoo.com, teste@hotmail.com";

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        String texto = "05/10/1495, 11/10/1995, 21/05/1395, 01/10/2295, 01/10/2095";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");

        while(matcher.find()){
            System.out.println("position: " + matcher.start() + " find: " + matcher.group() + " " + matcher.end());
        }

    }

}

