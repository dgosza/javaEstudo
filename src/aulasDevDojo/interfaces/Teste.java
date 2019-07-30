package aulasDevDojo.interfaces;

public class Teste {
    public static void main(String[] args) {

        Produto produto = new Produto("Headset", 6, 170);

        produto.calculaImposto();
        produto.calculaFrete();

        System.out.println(produto);



    }
}
