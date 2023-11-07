package Exercicios.A2;

public class Exercicio1 {

    public static void main(String[] args) {
        new Exercicio1();
    }

    public Exercicio1() {
        double vetor [] = {4.3,6.1,0.1,1.9,2.4,7.2,5.5};//7 itens - indice 6
        int N = vetor.length;

        System.out.println("Vetor original: ");
        for(int i=0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            System.out.print(" | ");   
        }
        inverteElemento(vetor, N);
    }

    public void inverteElemento(double[] vetor, int N) {
        double [] invertidos = new double [N];//7
        
        for (int i=0; i < vetor.length; i++){
            N -= 1;//decrementando 1 de N para virar índice e permanecer diminuindo nos próximos ciclos
            invertidos[i] += vetor[N]; /* 6, 5, 4, 3, 2, 1, 0 } vetor[6]
                                          0, 1, 2, 3, 4, 5, 6   invertidos[i]  */
        }
        
        System.out.println("\nVetor invertido: ");
        for(int j=0; j<invertidos.length; j++) {
            System.out.print(invertidos[j]);
            System.out.print(" | ");
        }
    } 
}
