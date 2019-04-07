package CursoUdemy.OrientacaoObjeto.Modulo1.entities;

public class Aluno {
    public String nomeAluno;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calculaNota(){
        return nota1 + nota2 + nota3;
    }

    public String toString(){
        return "FINAL GRADE = "+String.format("%.2f", calculaNota());
    }
}
