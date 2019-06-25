package aulasDevDojo.modificadorEstatico;

public class Carro {
    //Velocidade limite deve ser de 240km/h
    private String nomeCarro;
    private double velocidadeMax;
    private static double velocidadeLimite = 240;

    public Carro(String nomeCarro, double velocidadeMax){
        this.nomeCarro = nomeCarro;
        this.velocidadeMax = velocidadeMax;
    }

    public Carro(){

    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void print(){
        System.out.println("--------------------------");
        System.out.println(this.nomeCarro);
        System.out.println("Velocidade Max: "+this.velocidadeMax);
        System.out.println("Velocidade Limite: "+this.velocidadeLimite);
    }
}
