package OrientacaoObjeto.entities;

public class Estudante {
    public String nome;
    public String sobrenome;
    public int idade;
    public double altura;

    public void exibe(){
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        System.out.println(altura);
    }

    public String retornaNome(){
        return sobrenome;
    }
}
