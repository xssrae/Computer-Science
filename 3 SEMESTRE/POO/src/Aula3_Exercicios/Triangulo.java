package Aula3_Exercicios;

public class Triangulo {
   float base;
    float altura;

    public Triangulo() {
    }
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float calcArea() {
        float area = 0;
        area = (base*altura)/2;
        
        return area;
    }

    public void imprimeDados() {
        System.out.println("-------------------------------------");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcArea());
    }
}