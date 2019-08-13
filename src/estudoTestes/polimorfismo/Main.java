package estudoTestes.polimorfismo;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        //INSTANCES
        Macaco macaco = new Macaco();
        Cachorro cachorro = new Cachorro();
        Peixe peixe = new Nemo();
        Cobra cobra = new Cobra();


        //MAMIFERO
        macaco.setMembros(4);
        macaco.setNome("Monkey Donk Kong");
        System.out.println("Nome: " + macaco.getNome());
        System.out.println("Membros: " + macaco.getMembros());
        macaco.alimentar();
        macaco.emitirSom();
        macaco.locomover();
        //
        System.out.println();
        //
        cachorro.setCorPelo("Azul");
        cachorro.setNome("Azulão");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Membros: " + cachorro.getMembros());
        cachorro.alimentar();
        cachorro.emitirSom();
        cachorro.locomover();


        //REPTIL
        System.out.println();
        cobra.setCorEscama("Roxo");
        cobra.setNome("Python");
        System.out.println("Nome: " + cobra.getNome());
        cobra.setMembros(0);
        System.out.println("Membros: " + cobra.getMembros());
        cobra.alimentar();
        cobra.emitirSom();
        cobra.locomover();


        //PEIXE
        System.out.println();
        peixe.setCorEscama("Amarelo Brilhante!");
        peixe.setNome("Nemo");
        System.out.println("Nome: " + peixe.getNome());
        peixe.setMembros(3);
        System.out.println("Membros: " + peixe.getMembros());
        peixe.alimentar();
        peixe.emitirSom();
        peixe.locomover();

        
    }
}
