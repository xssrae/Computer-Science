import java.util.Scanner;
public class Exe1 {
    public static void main(String [] args) {
        int a,b, produto;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Entrada:");
        a = leia.nextInt();
        b = leia.nextInt();
        
        System.out.println("Saída:");
        produto = a*b;
        System.out.println("Produto: " + produto);
    } 
}
