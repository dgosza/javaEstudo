
package aulasDevDojo.modificadorEstatico;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        System.out.println("Exibindo quantidade de parcelas possiveis");
//        for (int parcela : Cliente.getParcelas()) {
//            System.out.print(parcela + " ");
//        }

        System.out.println("Tamanho: "+ Cliente.getParcelas().length);

    }
}
