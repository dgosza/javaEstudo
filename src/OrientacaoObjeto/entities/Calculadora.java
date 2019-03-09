package OrientacaoObjeto.entities;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);
    }

    public void subtraiNumber(){
        System.out.println(10-7);
    }

    public void multiplicaNumero(int n1, int n2){

        System.out.println(n1*n2);
    }

    //metodos acima nao tem retorno

    public double divideDoisNumeros(double n1, double n2){
        return n1/n2;
    }


}
