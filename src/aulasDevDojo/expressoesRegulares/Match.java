package aulasDevDojo.expressoesRegulares;

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
        System.out.println("HÁ DUAS OCORRENCIAS DE STRING ?" + verifica7);

        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        boolean verifica8 = "99855-999".matches(cep);
        System.out.println("CEP VALIDO ?" + verifica8);

        boolean verifica9 = "23".matches("\\d{2}");
        System.out.println("Há 2 numeros ?" + verifica9);

        boolean verifica10 = "23".matches("\\d{9,}");
        System.out.println(verifica10);



        boolean palavra = "Java322".matches("^Java.*");
        System.out.println(palavra);

        //Termina com 322
        //O ponto (.) Começa com qualquer caractere e busca 0
        //ou mais caracteres finalizando com o num 322
        palavra = "Java322".matches(".*322$");
        System.out.println(palavra);

        //Pesquisa se uma palavra existe no texto
        palavra = "Hello World Java".matches(".*Java.*");
        System.out.println(palavra);

        //Pesquisa os caracteres que estão depois da letra O e antes da palavra Java
        palavra = "O mundo Java".matches("^O.*Jaava$");
        System.out.println(palavra);

        //Pesquisa pela palavra Inter ou Grêmio
        boolean time = "Grêmio".matches("Inter|Grêmio");
        System.out.println("Time: "+time);
    }
}
