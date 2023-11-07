import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, i;
        double soma;
        num = leia.nextInt();

        for(i=1; i<=num; i++){
            soma = i + (double)i/num;
            System.out.printf("\n%.1f",soma);
        }
    }
}