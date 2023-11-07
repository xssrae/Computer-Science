import java.util.Scanner;
public class Exe3 {
    public static void main(String[]args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Valor da compra: ");
        double valor = leia.nextDouble();
        System.out.println("Nº parcelas:");
        int parcela = leia.nextInt();

        calcJuros(valor, parcela);
    }
    public static double calcJuros(double v, int p){
        double valorParcela, valorJuros;
        valorParcela = v / p;
        valorJuros = valorParcela + (valorParcela * 0.05);
        System.out.print("Valor final com juros de 5%: " + valorJuros); //format dá erro de excessão

        return valorJuros;
    }
}
