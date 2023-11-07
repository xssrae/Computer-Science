import java.util.Scanner;
import java.lang.Math;
public class Exe4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double a, b, c, delta;

        System.out.print("A: ");
        a = leia.nextDouble();
        System.out.print("B: ");
        b = leia.nextDouble();
        System.out.print("C: ");
        c = leia.nextDouble();

        delta = getDelta(a, b, c);
        getX1(a, b, c, delta);
        getX2(a, b, c, delta);
    }
    public static double getDelta(double x, double y, double z) {
        double d = y*y - 4 *(x*z);
        System.out.printf("\nDelta: %.2f " , d);
        return d;
    }
    public static double getX1(double x, double y, double z, double d) {
        double x1 = (-y + Math.sqrt(d))/(2*x);
        System.out.printf("\nx1: %.2f " , x1);
        return x1;
    }
    public static double getX2(double x, double y, double z, double d) {
        double x2 = (-y - Math.sqrt(d))/(2*x);
        System.out.printf("\nx2: %.2f " , x2);
        return x2; 
    }
}