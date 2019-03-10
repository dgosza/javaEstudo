package OrientacaoObjeto.Modulo1.application;

public class Metodos {

    public static void calculaProcedimento(int a, int b){

        int s  = a + b;
        System.out.println("A soma é "+s);

    }

    public static int calculaFuncao(int a, int b){
        int s = a + b;
        return s;
    }


    public static void main(String[] args) {

        System.out.print("Chamada do Procedimento");
        calculaProcedimento(5,2);

        int recebeReturn = calculaFuncao(10,2);
        System.out.print("Chamada da Função"+ recebeReturn);

    }


}
