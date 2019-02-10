package OrientacaoObjeto.entities;

public class Retangulo {
    public double width;
    public double height;


    public double calculaArea(){
        return width * height;
    }

    public double calculaPerimetro(){
        return width + width + height + height;
    }

    public double calculaDiagonal(){
        double area = width * width + height * height;
        return Math.sqrt(area);
    }

    public String toString(){
        return "AREA = "+String.format("%.2f", calculaArea())+"\n PERIMETER = "+String.format("%.2f", calculaPerimetro())+"\n DIAGONAL = "+String.format("%.2f", calculaDiagonal());
    }

}
