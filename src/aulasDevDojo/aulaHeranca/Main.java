package aulasDevDojo.aulaHeranca;

public class Main{
  public static void main(String[] args){
    
    Pessoa p = new Pessoa();
    p.setNome("Diego");
    p.setCpf("40671010101");

    Endereco end = new Endereco();
    end.setRua("Av. Dr. Assis Ribeiro");
    end.setBairro("Eng Goulart");

    p.setEndereco(end);
    p.print();

    Funcionario f = new Funcionario();

    f.setNome("Nathalia");
    f.setCpf("546546");
    f.setEndereco(end);
    f.setSalario(456);
    f.print();

  }
}