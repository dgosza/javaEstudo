package studyUdemy.methods;

public class Estoque {
    private String name;
    private double price;
    private int quantity;


    public Estoque(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }



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
