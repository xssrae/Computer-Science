// MÉTODOS
// Procedimentos: quando uma sequencia de instruções 
import java.util.Scanner;
public class Exemplo1{
    Scanner leia = new Scanner(System.in);
    public static void main(String []args) {
    int resp = soma(5, 4);
    System.out.println(resp);
    }

    public static int soma(int x, int y) {
        int total;
        total = x + y;
        return total;    
    }
}