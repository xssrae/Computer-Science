import java.util.Scanner;
/*
 *  Faça um algoritmo que receba 10 números inteiros e armazene-os em um vetor. Calcule e mostre dois vetores resultantes. O primeiro com os números pares e o segundo com os números ímpares.
*/
public class Vetor{
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);
        int num;
        int i, j, pares = 0, impares = 0;

        System.out.println("Informe 10 numeros: ");
        for(i=0; i <10; i++){
            num = leia.nextInt();
            if(num%2 == 0){
                pares++;
            }else{
                impares++;
            }
            int [] vetorPares = new int [pares];
            int [] vetorImpares = new int [impares];
    
            for(j=0; j<10; j++){
                if(num%2 == 0){
                    vetorPares[j] += num;
                }else{
                    vetorImpares[j] += num;
                }
            }
        }

 // definindo a qtde de numeros encontrados pra cada vetor

        System.out.println("Os números IMPARES são: ");
        for(i=0; i < vetorImpares.length; i++){
            System.out.println(vetorImpares[i]);
        }
        System.out.println("Os números PARES são: ");
        for(i=0; i < vetorPares.length ; i++){
            System.out.println(vetorPares[i]);
        }
    }
}