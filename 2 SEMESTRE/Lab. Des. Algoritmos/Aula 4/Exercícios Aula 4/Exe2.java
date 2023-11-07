import java.util.Scanner;
public class Exe2 {
    public static void main(String [] args) {
        int a,b,c,d, dif;
        Scanner leia = new Scanner(System.in);

        System.out.print("Calculo de diferença entre produtos.");
        System.out.print("\nA:");
        a = leia.nextInt();
        System.out.print("B:");
        b = leia.nextInt();
        System.out.print("C:");
        c = leia.nextInt();
        System.out.print("D:");
        d = leia.nextInt();

        dif = a*b - c*d;
        System.out.println("Diferença dos produtos:" + dif);
    }
}
