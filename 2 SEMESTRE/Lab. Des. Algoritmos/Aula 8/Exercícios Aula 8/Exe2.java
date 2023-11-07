import java.util.Scanner;
/*
 * Faça um programa em Java que imprima os números de 1 a 50 de 1 em 1 e de 52
 * a 100 de 2 em 2.
*/
public class Exe2 {
    public static void main(String[] args) {
        int i;

        for(i=1; i<=100; i++){
            System.out.println(i+1);
            if(i>=50){
                i+=1;
            }
        }
    }
}
