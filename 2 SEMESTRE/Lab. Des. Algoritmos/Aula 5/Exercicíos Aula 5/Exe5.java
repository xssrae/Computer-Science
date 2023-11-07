import java.util.Scanner;
public class Exe5 {
    public static void main(String[] args) {
        double objUm, objDois, objTres;
        int t1, t2, t3;
        Scanner leia = new Scanner(System.in);

        System.out.print("Objeto 1: ");
        objUm = leia.nextDouble();
        System.out.print("Tempo 1: ");
        t1 = leia.nextInt();
        System.out.print("Objeto 2: ");
        objDois = leia.nextDouble();
        System.out.print("Tempo 2: ");
        t2 = leia.nextInt();
        System.out.print("Objeto três: ");
        objTres = leia.nextDouble();
        System.out.print("Tempo 3: ");
        t3 = leia.nextInt();

        vMedia(objUm, t1);
        vMedia(objDois, t2);
        vMedia(objTres, t3);
    }

    public static double vMedia(double objeto, int tempo) {
        double vm;
        vm = objeto / tempo;
        System.out.printf("\nVelocidade média: %.2f", vm);

        return vm;
    }
}
