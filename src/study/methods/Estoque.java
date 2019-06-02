package study.methods;

public class Estoque {
    public String name;
    public double price;
    public int quantity;

    public double calculaTotal(){
        return price*quantity;
    }

}
