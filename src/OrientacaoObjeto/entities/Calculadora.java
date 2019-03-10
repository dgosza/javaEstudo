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

    public void alteraDoisNumeros(int n1, int n2){

        n1 = 30;
        n2 = 40;

        System.out.println("Dentro de altera dois numeros");
        System.out.println("num1 = "+ n1);
        System.out.println("num1 = "+ n2);


    }


}
