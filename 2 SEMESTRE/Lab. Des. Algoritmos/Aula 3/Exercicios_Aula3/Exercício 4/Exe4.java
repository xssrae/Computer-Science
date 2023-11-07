/*
 * 4- Escreva um programa em Java que calcule as duas raízes de uma equação de 2º
 * grau ax²+bx+c, conhecendo os valores dos coeficientes da mesma (a, b, c). Suponha
 * que as raízes são reais. Lembre-se que para calcular as duas raízes:
*/

import java.lang.Math;
import java.util.Scanner;
public class Exe4 {
    public static void main(String [] args) {
        
        double a, b, c, delta, x1, x2;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor de A:");
        a = leia.nextDouble();
        System.out.print("Digite o valor de B:");
        b = leia.nextDouble();
        System.out.print("Digite o valor de C:");
        c = leia.nextDouble();
        /* ax²+bx+c */
        //  D = (b**2 - 4*a*c) - python*/
        delta = (b*b)-(4*a*c);
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.printf("Valor de Delta: %.2f", delta);
        System.out.printf("\nValor de x1: %.2f", x1);
        System.out.printf("\nValor de x2: %.2f", x2);
    }
}
