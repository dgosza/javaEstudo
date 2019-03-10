package OrientacaoObjeto.Modulo1.entities;

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

    public void imprimeDados(){
        System.out.println("----------------------");
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.rg);
    }

}
