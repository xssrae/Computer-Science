import java.util.Scanner;

public class Ex1{
    public static void main(String[]args) {
        String texto;
        int num;
        Scanner leia = new Scanner(System.in);

        System.out.println("DIGITA UM NUMERO AE");
        num = leia.nextInt();
        System.out.println("AGR DIGITA ALGO AE");
        texto = leia.next();
        imprimir(texto, num);
        imprimir("VÊM AÍ DP", 28);
    }

    public static void imprimir(String texto , int num){
        System.out.println("OIA OQ VC DIGITOU: " + num + texto);
    }
}
