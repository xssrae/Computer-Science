import java.util.Scanner;
public class Exe7 {
    public static void main(String[]args) {
        Scanner leia = new Scanner(System.in);

        int telheiro, quadrado;
        double total, comissao;
        System.out.println("Digite a quantidade vendida:");
        System.out.print("Teleiro: ");
        telheiro = leia.nextInt();
        System.out.print("Quadrado: ");
        quadrado = leia.nextInt();
        total = calcArreca(telheiro, quadrado);
        comissao = calcComissao(telheiro, quadrado, total);
    }
    
    public static double calcArreca(int t, int q) {
        double valorArrecadado, qtdeTeler, qtdeQuadrado;
        //Cada telheiro custa R$ 1,05 e o quadrado custa R$ 0,5
        qtdeTeler = 1.05*t;
        qtdeQuadrado = 0.5*q;
        valorArrecadado = qtdeQuadrado + qtdeTeler;
        System.out.printf("\nO valor arrecadado com as vendas: %.2f" , valorArrecadado);
        
        return valorArrecadado;
    }
    public static double calcComissao(int t, int q, double valorArrecadado) {
        double valorComissao;
        //separar de comissão (10% do total arrecadado)
        valorComissao = valorArrecadado*0.1;
        System.out.printf(" \nO valor comissão atingido: %.2f" , valorComissao);

        return valorComissao;
    }
}