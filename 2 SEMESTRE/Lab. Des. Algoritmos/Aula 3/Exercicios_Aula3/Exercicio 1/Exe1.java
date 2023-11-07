/*
 * 1- Desenvolva um programa em Java que solicite ao usuário os valores dos lados de
 * um retângulo e calcule e mostre seu perímetro e sua área
 * 
*/

import java.util.Scanner;
public class Exe1{
    public static void main(String[] args){

        double ladoBase, ladoAltura, perimetro, area;
        Scanner leia = new Scanner(System.in);

        System.out.println("Calculo de Área e Perímetro d eum Retângulo.");

        System.out.print("Digite o valor da base: ");
        ladoBase = leia.nextDouble();
        System.out.print("Digite o valor da altura: ");
        ladoAltura = leia.nextDouble();
        perimetro = (ladoBase + ladoAltura)*2;
        area = ladoBase*ladoAltura;

        System.out.printf("O valor do perímetro do Retangulo é: %.2f", perimetro);
        System.out.printf("\nO valor da Área do Retangulo é: %.2f", area);
    }
}