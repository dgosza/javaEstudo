public class Pessoa{

  protected String nome;
  protected String cpf;
  protected Endereco endereco;

  public void print(){
    System.out.println("Nome: "+this.nome);
    System.out.println("CPF: "+this.cpf);
    System.out.println("Endereço: "+this.endereco.getRua()+" "+" Bairro: "+this.endereco.getBairro());
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public void setEndereco(Endereco endereco){
    this.endereco = endereco;
  }

  public String getNome(){
    return this.nome;
  }

  public String getCpf(){
    return this.cpf;
  }

  public Endereco getEndereco(){
    return this.endereco; 
  }

}