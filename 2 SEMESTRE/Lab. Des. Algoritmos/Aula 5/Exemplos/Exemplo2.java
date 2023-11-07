import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String [] args) {
        System.out.println(soma(4, 5));
        Scanner leia = new Scanner(System.in);

        System.out.println("");
        int n1 = leia.nextInt();
        System.out.println("");
        int n2 = leia.nextInt();
        leia.close();
        imprimirSoma(n1, n2);
    }

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }
    
    public static void imprimirSoma(int n1, int n2) {
        JOptionPane.showMessageDialog(null, "soma" + soma (n1,n2));
        
    }
}
