package FigurasRegulares;
import java.lang.Math;
public class Cuadrado {
    public double side;
    // Empty Constructor
    public Cuadrado() {
    }
    // Constructor
    public Cuadrado(double side){
        this.side = side;
    }
    // getter
    public double getSide(){
        return side;
    }
    // setter
    public void setSide(double side){
        this.side = side;
    }
    // Customised Method
    public double areaCuadrado(){
        double area = Math.pow(side,2);
        return area;
    }
    public double perimetroCuadrado(){
        double perimetro = side*4;
        return perimetro;
    }
}



