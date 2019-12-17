package aulasDevDojo.tokens;

public class Main {
    public static void main(String[] args) {

        String nome = "Diego-Nathalia-Daniel-Ronaldo-Eric-John";
        //separa de acordo com o limitador ' - ' contido na string acima
        //abaixo, usamos expressao regular para defirnir qualquer tipo de separador diferente de letra e numero,
        // como ,.-_, etc.
        String[] tokens = nome.split("\\W");

        for(String token : tokens){
            System.out.println(token.trim());
        }

    }
}
