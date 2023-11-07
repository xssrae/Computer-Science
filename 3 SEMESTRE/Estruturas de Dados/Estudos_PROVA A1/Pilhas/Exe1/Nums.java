package Pilhas.Exe1;
import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
        Pilha1 pilha1 = new Pilha1();
        Scanner lendo = new Scanner(System.in);
        
        for(int i = 0; i<pilha1.getMAX(); i++){
            int num = 0;
            System.out.println("Digite um número para empilhar: ");
            System.out.print("N " + (i+1) + ": ");
            num = lendo.nextInt();
            pilha1.push(num);//Números sendo adicionados na pilha

            if(num%2 ==0){
                System.out.println("Número mantido.");
            }else{
                pilha1.pop();
                System.out.println("Número desempilhado.");
            }

        }
        System.out.println();
        System.out.println(pilha1.toString());
    }
}
