package CursoUdemy.OrientacaoObjeto.Modulo2.methods;


public class Carro {


    private String cor;
    private double preco;
    private String modelo;

    public Carro(){
        System.out.println("Classe carro foi instanciada");
    }

    public Carro(double preco, String modelo){
        this.modelo = modelo;
        this.preco = preco ;
        System.out.println("Classe carro foi instanciada");
        System.out.println(modelo);
        System.out.println(preco);
    }





}
