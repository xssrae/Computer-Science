import java.util.Scanner;

import java.util.Scanner;
public class Exemplo7 {
    public static void main(String[] args) {
        int num, soma = 0;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Diigte um número: ");
            num = leia.nextInt();
            soma += num;
            if(num%2 == 1){
                soma += num;
            }
        }while(num != 0)
            System.out.println("A soma é " + soma);
    }
}
