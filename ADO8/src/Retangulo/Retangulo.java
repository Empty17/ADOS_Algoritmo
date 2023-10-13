package Retangulo;

public class Retangulo {
    private double altura;
    private double base;

    private double area;
    private double perimetro;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private void area(){
        area = this.altura * this.base;

    }
    private void perimetro(){
        perimetro = (this.altura + this.altura ) * 2;
    }

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
        area();
        perimetro();
    }

}
