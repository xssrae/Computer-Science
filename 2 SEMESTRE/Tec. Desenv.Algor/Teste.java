import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = leia.nextInt();
        parNum(num);
    }

    public static void parNum(int valor) {
        if(valor%2 == 0){
            System.out.println(valor + " é par.");
        }
        else{
            System.out.println(valor + " é impar");
        }
    }
}