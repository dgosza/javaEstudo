package aulasDevDojo.interfaces;

public class Teste {
    public static void main(String[] args) {

        Produto produto = new Produto("Headset", 1.5, 170.34);

        produto.calculaImposto();
        produto.calculaFrete();

        System.out.println(produto);

    }
}
