import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        double salario, bonus;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o salário bruto: ");
        salario = leia.nextDouble();

        bonus = salario > 1000 ? salario * 0.10 : salario * 0.15;
        System.out.printf("A bonificação é %.2f", bonus);
    }
}
