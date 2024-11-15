import java.util.Scanner;
import java.lang.Math;
// Erick Nuñez
// import classes of FigurasRegulares
import FigurasRegulares.Cuadrado;
import FigurasRegulares.Rectangulo;
import FigurasRegulares.Triangulo;
import FigurasRegulares.Circulo;
public class Main {
    public static void main(String[] args){
        Scanner typeString = new Scanner(System.in);
        System.out.println(" [CORRECTION OF EXAM]  ");
        // Class Cuadrado
        System.out.println(" [CLASE CUADRADO] ");
        Cuadrado cuadradoA = new Cuadrado();
        System.out.print(" >> Ingrese un lado del Cuadrado en [cm]: ");
        double ladoCuadrado =  typeString.nextDouble();
        cuadradoA.setSide(ladoCuadrado);
        System.out.println(" >> El valor ingresado es: " + cuadradoA.getSide() + " cm");
        System.out.println(" >> El area del cuadrado es: " + cuadradoA.areaCuadrado() + " cm");
        System.out.println(" >> El perimetro del cuadrado es: " + cuadradoA.perimetroCuadrado()+ " cm");
        // Class Rectangulo
        System.out.println(" [CLASE RECTANGULO] ");
        Rectangulo rectanguloA = new Rectangulo();
        System.out.print(" >> Ingrese el ancho del Rectangulo en [cm]: ");
        double ancho = typeString.nextDouble();
        rectanguloA.setAncho(ancho);
        System.out.print(" >> Ingrese el alto del Rectangulo en [cm]: ");
        double largo = typeString.nextDouble();
        rectanguloA.setLargo(largo);
        System.out.println("[Ancho del Rectangulo]: " + rectanguloA.getAncho() + " cm");
        System.out.println("[Largo del Rectangulo]: " + rectanguloA.getLargo() + " cm");
        System.out.println(" >> El area del rectangulo es: " + rectanguloA.areaRectangulo() + " cm");
        System.out.println(" >> El perimetro del rectangulo es: " + rectanguloA.perimetroRectangulo()+" cm");
        // Class Circulo
        System.out.println(" [CLASS CIRCULO] ");
        Circulo circuloA = new Circulo();
        System.out.print(" >> Ingrese el radio del Circulo en [cm]: ");
        double radius = typeString.nextDouble();
        circuloA.setRadius(radius);
        System.out.println(" >> Radio del circulo: " + circuloA.getRadius() + " cm");
        System.out.println(" >> El area del circulo es: " + circuloA.areaCirculo() + " cm");
        System.out.println(" >> El perimetro del circulo es: " + circuloA.perimetroCirculo()+" cm");
        // Class Triangulo
        System.out.println(" [CLASS TRIANGULO] ");
        Triangulo trianguloA = new Triangulo();
        System.out.print(" >> Ingrese la altura del Triangulo en [cm]: ");
        double altura = typeString.nextDouble();
        trianguloA.setAltura(altura);
        System.out.print(" >> Ingrese la base del Triangulo en [cm]: ");
        double base = typeString.nextDouble();
        trianguloA.setBase(base);
        circuloA.setRadius(radius);
        System.out.println("[Base del Triangulo]: " + trianguloA.getBase() + " cm");
        System.out.println("[Altura del Triangulo]: " + trianguloA.getAltura() + " cm");
        System.out.println(" >> El area del triangulo es: " + trianguloA.areaTriangulo() + " cm");
        System.out.print(" >> Ingrese un lado del triangulo en [cm]: ");
        double lado1 = typeString.nextDouble();
        System.out.print(" >> Ingrese otro lado del triangulo en  [cm]: ");
        double lado2 = typeString.nextDouble();
        System.out.println(" >> El perimetro del triangulo es: " + trianguloA.perimetroTriangulo(lado1,lado2)+" cm");
        // Suma de las Areas
        double areaCua = cuadradoA.areaCuadrado();
        double areaRec = cuadradoA.areaCuadrado();
        double areaCir = cuadradoA.areaCuadrado();
        double areaTri = cuadradoA.areaCuadrado();
        double sumAreas = (areaCua+areaRec+areaCir+areaTri);
        System.out.println(" >> La suma de las areas es: " + Math.round(sumAreas));
        // Revisando el estado de los commit
    }
}