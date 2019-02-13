package OrientacaoObjeto.entities;

public class Professor {

    public String nome;
    public int matricula;
    public int rg;
    public int cpf;

    public void mostraDados(){
        System.out.println("Nome "+nome);
        System.out.println("RG: "+rg);
        System.out.println("CPF: "+cpf);
    }

}
