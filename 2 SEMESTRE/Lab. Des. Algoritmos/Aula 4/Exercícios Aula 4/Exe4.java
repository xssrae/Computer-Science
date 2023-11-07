import java.util.Scanner;
import java.lang.Math;

public class Exe4 {
    public static void main(String [] args) {
        double x1,x2,y1,y2, distancia;
        Scanner leia = new Scanner(System.in);

        System.out.print("x1: ");
        x1 = leia.nextDouble();
        System.out.print("x2: ");
        x2 = leia.nextDouble();
        System.out.print("y1: ");
        y1 = leia.nextDouble();
        System.out.print("y2: ");
        y2 = leia.nextDouble();

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        System.out.printf("Distância entre os pontos: %.2f " , distancia);    
    }   
}
