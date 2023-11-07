/* 2- Faça um programa que receba três notas, calcule e mostre a média aritmética. */

import java.util.Scanner;
public class Exe2{
    public static void main(String[] args) {
        double nota1, nota2, nota3, mediaNotas;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = leia.nextDouble();

        mediaNotas = (nota1 + nota2 + nota3)/3;

        System.out.printf("Sua média é %.2f" , mediaNotas);
    }
}