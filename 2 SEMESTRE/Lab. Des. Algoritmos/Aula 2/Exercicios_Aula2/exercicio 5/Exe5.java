/* 5- Faça um programa que receba o salário base de um funcionário, calcule e mostre o
salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário
base e paga imposto de 7% também sobre o salário base. */

import java.util.Scanner;
public class Exe5 {
    public static void main(String[] args) {

        double salarioBase, salario;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        salarioBase = leia.nextDouble();
        
        salario = salarioBase + ((salarioBase*0.05) - 0.07);  /*Acrécimo do valor de 25% sobre o s*/
    
        System.out.printf("O salário base com a gratificação e imposto é de: %.2f" , salario);
    }
}