package Exercicios.A1;

public class Exe2 {
    public static void main(String [] args) {
        int q = 0, i, j, k;
        int n = 8;
        
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                for (k=0; k<n; k++) {
                    q += 1;
                }
            }
        }
        System.out.println(q); // dado que defini (n = 8), executa = 512 vezes
    }
}
