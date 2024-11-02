package FigurasRegulares;
import java.lang.Math;
public class Rectangulo {
    public double ancho;
    public double largo;
    // Empty Constructor
    public Rectangulo(){
    }
    // Constructor
    public Rectangulo(double ancho,double largo){
        this.ancho = ancho;
        this.largo = largo;
    }
    // getters
    public double getAncho(){
        return ancho;
    }
    public double getLargo(){
        return largo;
    }
    // setters
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public void setLargo(double largo){
        this.largo = largo;
    }
    // Custom Methods
    public double areaRectangulo(){
        double area = ancho*largo;
        return area;
    }
    public double perimetroRectangulo(){
        double perimetro = (ancho*2)+(largo*2);
        return perimetro;
    }
}

