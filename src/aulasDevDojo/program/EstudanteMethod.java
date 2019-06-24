package aulasDevDojo.program;

public class EstudanteMethod {

    private String nome;
    private int idade;
    private double[] notas;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for(double nota : this.notas){
            System.out.print(nota +" ");
        }
    }

    public void retornaMedia() {
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }

        media = media / notas.length;

        if (media >= 6) {
            System.out.println("Sua média é "+media);
            System.out.println("Aprovado!");
        } else {
            System.out.println("Sua média é "+media);
            System.out.println("Reprovado!");
        }

    }

}
