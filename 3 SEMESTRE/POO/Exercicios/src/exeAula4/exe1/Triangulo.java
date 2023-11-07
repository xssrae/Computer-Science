/*
 * Aluna: RAQUEL ALVES FONTES
 * RGM: 30109884
*/

package exeAula4.exe1;

public class Triangulo {
    float base;
    float altura;

    public Triangulo(){}

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calcArea() {
        float area = 0;
        area = (base * altura)/2;
        return area;
    }

    public void imprimeCalculo() {
        System.out.println("----------------Calculo da área do triangulo-------------------");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcArea());
    }
}