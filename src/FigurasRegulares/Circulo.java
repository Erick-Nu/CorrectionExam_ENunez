package FigurasRegulares;
import java.lang.Math;
public class Circulo {
    public double radius;
    // Empty Constructor
    public Circulo(){
    }
    // Constructor
    public Circulo(double radius){
        this.radius = radius;
    }
    // getters
    public double getRadius(){
        return radius;
    }
    // setters
    public void setRadius(double radius){
        this.radius = radius;
    }
    // Custom Methods
    public double areaCirculo(){
        double area = (Math.PI * Math.pow(radius, 2));
        return Math.round(area);
    }
    public double perimetroCirculo(){
        double perimetro = 2 * Math.PI * radius;
        return Math.round(perimetro);
    }
}
