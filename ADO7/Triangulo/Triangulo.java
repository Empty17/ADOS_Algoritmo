package Triangulo;


public class Triangulo {
    private double catetoOposto;
    private double catetoAdjacente;

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


    public double area(){
        return (this.getCatetoAdjacente() * this.getCatetoOposto()) / 2;
    }

    public double perimetro(){
        return this.getCatetoAdjacente() + this.getCatetoOposto() + hipotenua();
    }

    public double hipotenua(){
        double catetos = (this.getCatetoAdjacente() * 2) + (this.getCatetoOposto() * 2);
        double hipo = Math.sqrt(catetos);
        return hipo;
    }
    
}
