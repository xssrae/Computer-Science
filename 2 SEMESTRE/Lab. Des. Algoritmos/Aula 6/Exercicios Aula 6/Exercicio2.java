import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        System.out.println("Digite um número inteiro: ");
        num = leia.nextInt();

        if(num >= 0 && num < 9){
            System.out.println("Valor correto");
        }else{
            System.out.println("Valor incorreto.");
        }
    }
}
