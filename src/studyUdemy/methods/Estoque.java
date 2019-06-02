package studyUdemy.methods;

public class Estoque {
    public String name;
    public double price;
    public int quantity;

    public double calculaTotal(){
        return price*quantity;
    }

    public void addProducts(int value){
        this.quantity = quantity + value;
    }

    public void removeProducts(int value){
        this.quantity = quantity - value;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price) //formata para valor decimal o atributo desejado
                + ", "
                +quantity
                +" units, TOTAL: $"
                +String.format("%.2f", calculaTotal());
    }

}
