import java.util.Scanner;
import java.lang.Math;
public class Em4 {
    public static void main(String[] args) {
        double num, raiz;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número: ");
        num = leia.nextDouble();
        if(num > 0){
            raiz = Math.sqrt(num);
            System.out.printf("A raiz de %.2f", raiz);
        }
        else{
            System.out.print(num + "não possui raiz.");
        }
    }
}
