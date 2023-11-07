import java.util.Scanner;

public class Exemplo1{
    public static void main(String [] args) {

        double n1, n2, n3, mediaPonderada;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a PRIMEIRA nota: ");
        n1 = leia.nextDouble();
        System.out.print("Digite a SEGUNDA nota: ");
        n2 = leia.nextDouble();
        System.out.print("Digite a TERCEIRA nota: ");
        n3 = leia.nextDouble();

        mediaPonderada = (n1*1 + n2*2 + n3*4)/7;

        System.out.printf("Sua média é %.2f", media); "Média", 2);
        
    }
}