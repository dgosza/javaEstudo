package aulasDevDojo.aulaHeranca;

public class Endereco{

  private String rua;
  private String bairro;

  public void print(){
    System.out.println("Rua: "+this.rua);
    System.out.println("this.bairro");
  }

  public void setRua(String rua){
    this.rua = rua;
  }

  public void setBairro(String bairro){
    this.bairro = bairro;
  }

  public String getRua(){
    return this.rua;
  }

  public String getBairro(){
    return this.bairro;
  }

}