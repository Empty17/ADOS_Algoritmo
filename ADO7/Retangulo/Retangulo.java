package Retangulo;

public class Retangulo {
    private double altura;
    private double base;
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
    

    public double area(){
        return this.getAltura() * this.getBase();
    }

    public double perimetro(){
        return 2 * (this.getBase() + this.getAltura());
    }
}
