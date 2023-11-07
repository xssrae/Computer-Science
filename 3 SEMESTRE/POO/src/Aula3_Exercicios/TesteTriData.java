package Aula3_Exercicios;

public class TesteTriData {
        public static void main(String[] args) {
        Triangulo tri = new Triangulo();

        tri.altura = 7;
        tri.base = 4;

        tri.calcArea();
        tri.imprimeDados();

        Data d = new Data();

        d.ano = 2003;
        d.mes = 3;
        d.dia = 28;
        d.imprimeDados();

    }
}
