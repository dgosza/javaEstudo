package aulasDevDojo.Program;

public class EstudanteMethod {

    private String nome;
    private int idade;
    private int nota1;
    private int nota2;
    private int nota3;

    private String calculaMedia(int n1, int n2, int n3){
        String result;
        double media = (n1 + n2+n3)/3;
        if(media>=6){
            result = "Aprovado!";
        }else{
            result = "Reprovado!";
        }
        return result;
    }

}
