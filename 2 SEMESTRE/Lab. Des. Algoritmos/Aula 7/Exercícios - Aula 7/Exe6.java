import java.util.Scanner;
public class Exe6{
    public static void main(String[] args) {
 
        Scanner leia = new Scanner(System.in);
         
        //formação de equação do segundo grau: ax²+bc+c=0
        //delta = b.b - 4.a.c
        //bhaskara = x = -b+- raiz de delta/2
         
        System.out.println("Digite o valor de A: ");
        double a = leia.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = leia.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = leia.nextDouble();
         
        double delta = b*b-4*a*c; 
        double x1 = (-b + Math.sqrt(delta))/ (2*a);
        double x2 = (-b - Math.sqrt(delta))/ (2*a);
         
        if (delta<0) {
            System.out.printf("A equação não possui valores reais pois Delta: %.2f", delta, "é um valor negativo.");
        }
        if (delta==0) {
            System.out.printf("Delta é igual a zero, portanto possui apenas uma raiz possível: \n X1: %.2f", x1, "\nX2: %.2f", x2);
        }       
        if(delta>0) {
            System.out.printf("Delta é igual a zero, portanto possui duas raizes reais: \n X1: %.2f", x1, "\nX2: %.2f", x2);
        }
    }
}