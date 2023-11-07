import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) {
        double ladoA, ladoB;
        Scanner leia = new Scanner(System.in);

        System.out.println("Lado A:");
        ladoA = leia.nextDouble();
        System.out.println("Lado B: ");
        ladoB = leia.nextDouble();
        calcArea(ladoA, ladoB);
    }

    public static double calcArea(double A, double B) {
        double area;
        area = A * B;
        System.out.printf("O valor da área é: %.2f ", area);
        return area;
    }
}
