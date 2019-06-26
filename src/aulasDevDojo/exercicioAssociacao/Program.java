package aulasDevDojo.exercicioAssociacao;

public class Program {
    public static void main(String[] args) {

        Aluno[] aluno = new Aluno[2];
        aluno[0] = new Aluno("Diego", 19, new Seminario());
        aluno[1] = new Aluno("Nathalia", 15, new Seminario());

        Professor[] professor = new Professor[2];
        professor[0] = new Professor();


        Seminario[] seminarios = new Seminario[2];
        seminarios[0] = new Seminario();

        Local local = new Local();

        for(Seminario seminario : seminarios){
            System.out.println(seminario);
        }
    }
}
