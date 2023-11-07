import java.sql.Struct;
import java.util.Scanner;
public class Exemplo6 {
    public static void main(String[] args) {
        double media, soma = 0;
        int i = 1;
        Scanner leia = new Scanner(System.in);
        char resp = 's';

        while(resp == 's' || resp == 'S'){
            System.out.println("Digite a media do " +i+ "º aluno: ");
            media = leia.nextDouble();
            soma += media;
            i++;
            System.out.println("Deseja continuar? \nS|N: ");
            resp = leia.next().charAt(0);
        }
        System.out.println("A média é " + soma/i);
    }
}
