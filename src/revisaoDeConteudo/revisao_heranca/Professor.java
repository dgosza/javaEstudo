package revisaoDeConteudo.revisao_heranca;

public class Professor {

    private double salario;
    private String nomeCurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 12;
    }


    //@Override
    public void setNome(String nome) {
       // super.setNome(nome);
    }



   // @Override
    public void setEndereco(String endereco) {
       // super.setEndereco(endereco);
    }



    //@Override
    public void setTelefone(String telefone) {
        //super.setTelefone(telefone);
    }


    //@Override
    public void setCpf(String cpf) {
        //super.setCpf(cpf);
    }



    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("metodo abstrato a ser implementado");
    }


}
