package OrientacaoObjeto.entities;

public class Professor {

    public String nome;
    public int matricula;
    public long rg;
    public String cpf;

    public void mostraDados(){
        System.out.println("Nome "+nome);
        System.out.println("RG: "+rg);
        System.out.println("CPF: "+cpf);
    }

    public void imprimeDados(Professor aux){
        System.out.println(aux.matricula);
        System.out.println(aux.nome);
        System.out.println(aux.cpf);
        System.out.println(aux.rg);
    }

}
