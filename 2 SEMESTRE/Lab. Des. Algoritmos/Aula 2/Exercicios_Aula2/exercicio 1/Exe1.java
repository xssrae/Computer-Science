/* 1- Crie um programa que solicite ao usuário a sua idade expressa em anos, meses e
dias (variáveis separadas). Calcule e mostre a idade expressa apenas em dias. Para
isso considere 1 ano = 365 dias, 1 mês = 30 dias. */

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        /*Declaração de variáveis*/
        int diasNoAno = 365;
		int diasNoMes = 30;
		int dias, meses, anos;

        Scanner leia = new Scanner(System.in); /*Inicialização do scanner*/

        /*Entrada de dados*/
		System.out.println("Digite sua idade.");
		System.out.print("Anos: ");
		anos = leia.nextInt();
		System.out.print("Digite o mês: ");
		meses = leia.nextInt();
		System.out.print("Digite os dias: ");
		dias = leia.nextInt();

        /*Calculo da idade*/
		dias += (anos * diasNoAno) + (meses * diasNoMes);
		
		System.out.println("\n\nA sua idade em dias é " + dias);
    }
}
