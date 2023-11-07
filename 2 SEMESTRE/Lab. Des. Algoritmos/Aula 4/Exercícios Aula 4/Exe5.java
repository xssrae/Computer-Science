import java.util.Scanner;
import java.lang.Math;

public class Exe5 {
    public static void main(String [] args) {
        float x,y,z,maior;
        Scanner leia = new Scanner(System.in);

        System.out.print("x: ");
        x = leia.nextFloat();
        System.out.print("y: ");
        y = leia.nextFloat();
        System.out.print("z: ");
        z = leia.nextFloat();

        maior = (x + y)/2 + Math.abs(x - y)/2;
        maior = (maior + z)/2 + Math.abs((maior - z)/2);
        System.out.printf("O maior numero inteiro é: %.0f", maior);
    }
}
