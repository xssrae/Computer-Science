package Exercicios.A1;

public class Exe3 {
    public static void main (String[] args){
        int valorNum = valorN(1000);
        System.out.println("Contagem de instruções: " + valorNum);// saída do valor final de k
    }
    
    public static int valorN(int n) {
        int k = 0, i = n;
        
        while (i > 1) {
            k += 1;// contagem da execução
            i /= 10;// i sendo dividido por 2 para controlar o loop
        }
        return k;
    }
}