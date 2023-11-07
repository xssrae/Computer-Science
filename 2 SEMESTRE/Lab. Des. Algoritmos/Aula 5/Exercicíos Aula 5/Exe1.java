import java.util.Scanner;
public class Exe1 {
    public static void main(String[] args) {
        double kmInicial, kmFinal, qtdeLitro, valLitro, distancia, valorTotal, valorMedio;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a distancia inicial: ");
        kmInicial = leia.nextDouble();
        System.out.println("Digite a distancia final: ");
        kmFinal = leia.nextDouble();
        System.out.println("Digite a qtde de gasolina ultilizada: ");
        qtdeLitro = leia.nextDouble();
        System.out.println("Digite o valor do litro de combustível: ");
        valLitro = leia.nextDouble();

        distancia = calcKm(kmInicial, kmFinal);
        valorTotal = calcvGasto(kmInicial, kmFinal, qtdeLitro, valLitro);
        valorMedio = calcConsM(valorTotal, distancia);
    }

    public static double calcKm(double kmI, double kmF) {
        double distPercorrida = kmF - kmI;
        System.out.printf("\nDistância percorrida: %.2f", distPercorrida, "metros");
        return distPercorrida;
    }

    public static double calcvGasto(double kmI, double kmF, double litro, double valor) {
        double valGasto;
        valGasto = litro*valor;
        System.out.printf("\nValor gasto pelo combustível: %.2f", valGasto);
        return valGasto;
    }

    public static double calcConsM(double valor, double dist) {
        double consMedio = valor/dist;
        System.out.printf("\nConsumo médio: %.2f", consMedio);  
        return consMedio;
    }
}