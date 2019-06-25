package aulasDevDojo.modificadorEstatico;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);

        Carro carro1 = new Carro("Veloster", 280);
        Carro carro2 = new Carro("Audi", 275);
        Carro carro3 = new Carro("BMW", 290);

        carro1.print();
        carro2.print();
        carro3.print();

    }
}
