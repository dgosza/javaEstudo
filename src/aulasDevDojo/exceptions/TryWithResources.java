package aulasDevDojo.exceptions;

import javax.print.DocFlavor;

public class TryWithResources {
    public static void main(String[] args) throws LoginInvalidoException, SenhaInvalidaException {
        System.out.println();

        String nomeBanco = "souza";
        String nomeDigitado = "souza";
        String senhaBanco = "diego";
        String senhaDigitado = "diegoo";

        System.out.println("Login do site");

        if(nomeBanco.equals(nomeDigitado)){
            System.out.println("Usuario Logado!");
            if(senhaBanco.equals(senhaDigitado)){
                System.out.println("Senha Correta");
                System.out.println("Usuario logado");
            }else{
                throw new SenhaInvalidaException();
            }
        }else{
            throw new LoginInvalidoException();
        }

    }
}
