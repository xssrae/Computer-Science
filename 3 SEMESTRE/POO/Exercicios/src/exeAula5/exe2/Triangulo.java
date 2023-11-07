/*
 * ALUNA: Raquel Alves Fontes
 * RGM: 30109884
*/

package exeAula5.exe2;

public class Triangulo {
    private double base, altura;

    public Triangulo(){}

    public Triangulo(double base, double altura){
        this.setAltura(altura);
        this.setBase(base);
    }

    public double calculaArea() {
        double area = (getBase()*getAltura())/2;
        return area;
    }

    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }


    public void imprimeDados() {
        System.out.println("Altura: " + getAltura());
        System.out.println("Base: " + getAltura());
        System.out.println("Area: " + calculaArea());
    }
}
