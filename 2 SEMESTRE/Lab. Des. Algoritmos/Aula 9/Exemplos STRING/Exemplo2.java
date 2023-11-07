import java.util.Scanner;
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leia.nextInt();
        //String temp = num + "";
        int tamanho = String.valueOf(num).length();
        System.out.println("Qtde de digitos: " + tamanho);
    }
}
