import java.util.Scanner;

public class Exemplo3 {
    
    public static void main(String [] args){

        double salarioBase, salarioFinal;
        int gratificação = 50;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        salarioBase = leia.nextDouble();

        salarioFinal = gratificação+(salarioBase-(salarioBase*0.1));

        System.out.printf("Seu salario a receber é: %.2f", salarioFinal);

    }

}
