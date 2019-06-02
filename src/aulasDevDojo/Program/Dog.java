package aulasDevDojo.Program;

import aulasDevDojo.methods.DogClass;

import java.util.Scanner;

public class Dog {
    public static void main(String[] args) {

        DogClass dog1 = new DogClass();
        Scanner leia = new Scanner(System.in);

        System.out.println("Entre com o nome do cachorro");
        dog1.setNome(leia.next());

        System.out.println("Entre com a raça do cachorro");
        dog1.setRaca(leia.next());

        System.out.println("Nome: "+dog1.getNome());
        System.out.println("Raça: "+dog1.getRaca());

        System.out.println("Escolha abaixo o que deseja fazer");

        char resp = 's';
        while(resp != 'n'){
            System.out.println("============================");
            System.out.println("OPÇOES PARA O CACHORRO FAZER");
            System.out.println("============================");

            System.out.println("1 = LATIR");
            System.out.println("2 = ANDAR");
            System.out.println("3 = MUDAR E MOSTRAR NOME");
            System.out.println("4 = TROCAR O LATIDO");
            System.out.println("5 = TROCAR O MODO DE ANDAR");
            int resposta = leia.nextInt();

            switch (resposta){
                case 1:
                    System.out.println(dog1.getLatido());
                    break;
                case 2:
                    System.out.println(dog1.getAndar());
                    break;
                case 3:
                    System.out.println("Escolha o nome novo");
                    dog1.setNome(leia.next());
                    System.out.println(dog1.getNome());
                    break;
                case 4:
                    System.out.println("Escreva o novo latido");
                    dog1.setLatido(leia.next());
                    break;
                case 5:
                    System.out.println("Escreva o modo de andar");
                    dog1.setAndar(leia.next());
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }

            System.out.println("Deseja repitir ?");
            resp = leia.next().charAt(0);
        }

    }
}
