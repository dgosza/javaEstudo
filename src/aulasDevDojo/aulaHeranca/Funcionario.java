public class Funcionario extends Pessoa{
  
  private double salario;

  public void print(){
    super.print();
    System.out.println("Salario: "+this.salario);
    imprimeReciboPagamento();
  }

  public void imprimeReciboPagamento(){
    System.out.println("Eu: "+super.nome+" recebi o pagamento de R$"+this.salario);
  }

  public void setSalario(double salario){
    this.salario = salario;
  }

  public double getSalario(){
    return this.salario;
  }

  

}