package Triangulo;public class Triangulo {

    private double catetoOposto;
    private double catetoAdjacente;
    private double area;
    private double perimetro;
    private double hipotenusa;


    public double getCatetoOposto() {
        return catetoOposto;
    }

    public void setCatetoOposto(double catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public double getCatetoAdjacente() {
        return catetoAdjacente;
    }

    public void setCatetoAdjacente(double catetoAdjacente) {
        this.catetoAdjacente = catetoAdjacente;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void hipotenua(){
        double catetos = (this.catetoAdjacente * this.catetoAdjacente) + (this.catetoOposto * this.catetoOposto);
        hipotenusa = Math.sqrt(catetos);
    }
    public void area(){
        area = (this.catetoAdjacente * this.catetoOposto) / 2;
    }

    public void perimetro(){
        perimetro = (this.catetoAdjacente + this.catetoOposto + hipotenusa);
    }


    public Triangulo(double catetoOposto, double catetoAdjacente) {
        this.catetoOposto = catetoOposto;
        this.catetoAdjacente = catetoAdjacente;
        hipotenua();
        area();
        perimetro();

    }
}
