import java.util.Scanner;
public class Exercício4 {
    public static void main(String[] args) {
        double salario, contaTel, contaLuz, contaAgua, resto, gasto;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        salario = leia.nextDouble();
        System.out.println("Valor da conta de água: ");
        contaAgua = leia.nextDouble();
        System.out.println("Valor da conta de luz: ");
        contaLuz = leia.nextDouble();
        System.out.println("Valor da conta de telefone: ");
        contaTel = leia.nextDouble();

        gasto = contaAgua + contaLuz + contaTel;
        
        if(gasto > salario){
            System.out.println("Salário insuficiente!");
        }else{
            resto = salario - gasto;
            System.out.printf("O resto do salário após pagas todas as contas: %.2f", resto);
        }
    }
}
