package aulasDevDojo.strings;

public class Main {
    public static void main(String[] args) {

        String nome = "Diego";
        nome =  nome.concat(" Souza");
        nome =  nome.concat(" Magalhaes de");
        nome =  nome.concat(" Souza");

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome);

        String teste = "goku old";
        String teste1 = "0123456789";
        System.out.println(teste.charAt(3));
        System.out.println(teste.length());
        System.out.println(teste.equals(teste1));
        System.out.println(teste.replace('o', 'p'));
        System.out.println(teste1.substring(0,2));
    }
}
