import java.lang.Math;
import java.util.Scanner;

public class Exemplo4 {
    public static void main(String [] args){

        float graus;
        double radianos, sen, cos, tan;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor em graus: ");
        graus = leia.nextFloat();


        radianos = (float)Math.toRadians(graus);
        sen = Math.sin(radianos);
        cos = Math.cos(radianos);
        tan = Math.cos(radianos);

        System.out.printf("O seno do ângulo é: %.2f " , sen);
        System.out.printf("O cosseno do ângulo é: %.2f " , cos);
        System.out.printf("A tangente do ângulo é %.2f" , tan);


    }

    
}

