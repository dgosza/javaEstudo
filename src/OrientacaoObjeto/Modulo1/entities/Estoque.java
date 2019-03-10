package OrientacaoObjeto.Modulo1.entities;

public class Estoque {
    public String name;
    public int quantity;
    public double price;

    public double totalEstoque() {
        return price * quantity;
    }

    public void addProducts(int add) {
        this.quantity += add;
    }

    public void removeProducts(int remove) {
        this.quantity -= remove;
    }

    public String toString(){
        return name +", $ "+String.format("%.2f", price)+", "+quantity+" units, Total: "+String.format("%.2f", totalEstoque());
    }

}

