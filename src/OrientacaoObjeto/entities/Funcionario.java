package OrientacaoObjeto.entities;

public class Funcionario {
    public String nomeFunc;
    public double salarioFunc;
    public double taxa;

    public double proxSalario(double tax){

        return salarioFunc += (salarioFunc * tax) / 100;
    }

    public double liquidoSalario(){
        return salarioFunc - taxa;
    }

    public String toString(){
        return "UPDATED data: "+nomeFunc+", $"+String.format("%.2f", liquidoSalario());
    }

}
