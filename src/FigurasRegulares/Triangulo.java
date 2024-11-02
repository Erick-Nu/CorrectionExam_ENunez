package FigurasRegulares;
public class Triangulo {
    public double base;
    public double altura;
    public Triangulo() {
    }
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    // Getters
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    // Setters
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    // Metodos personalizados

    public double areaTriangulo() {
        return (base * altura) / 2;
    }
    public double perimetroTriangulo(double lado1, double lado2) {
        return base + lado1 + lado2;
    }
}
