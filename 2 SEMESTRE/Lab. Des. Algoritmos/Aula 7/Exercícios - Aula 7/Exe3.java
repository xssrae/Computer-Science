import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) {
        double n1,n2;
        double resposta = 0; // Variável que necessita de valor inicial porque recebe um método com retorno. (Sem o 0 inicial: "The local variable may not have been initialized")
        Character operacao;
        Scanner leia = new Scanner(System.in);

        System.out.print("\nBem vindo a Calculadora!");
        System.out.print("\nPrimeiro valor: ");
        n1 = leia.nextDouble();
        System.out.print("Segundo valor: ");
        n2 = leia.nextDouble();
        System.out.println("\nEscolha uma operação: \nSoma: + \nSubtração: - \nMultiplicação: * \nDivisão: /");
        operacao = leia.next().charAt(0);

        switch(operacao){
            case '+': resposta = somaNum(n1, n2);
            break;
            case '-': resposta = subtraiNum(n1,n2);
            break;
            case '*': resposta = multiplicaNum(n1, n2);
            break;
            case '/': resposta = divideNum(n1,n2);
        }
        System.out.println(n1 + " " + operacao + " " + n2 + " = " + resposta);
    }

    public static double somaNum(double x, double y) {
        double resultado = x + y;
        return resultado;
    }
    public static double subtraiNum(double x, double y) {
        double resultado = x - y;
        return resultado;
    }
    public static double multiplicaNum(double x, double y) {
        double resultado = x*y;
        return resultado;
    }
    public static double divideNum(double x, double y) {
        double resultado = x/y;
        return resultado;
    }
}
