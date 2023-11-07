/*
Aluna: Raquel Alves Fontes
RGM: 30109884
*/

package Exercicios.A4;

public class OrdenaNumeros {
    public static void main(String[] args) {
        new OrdenaNumeros();
    }

    public OrdenaNumeros() {
        int [] numeros = {4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61};

        System.out.println("\nNúmeros desordenados:");
        visualizar(numeros);
        ordenaNumeros(numeros);
        System.out.println();
        System.out.println("Números ordenados em ordem Decrescente: ");
        visualizar(numeros);
        ordenaNumeros(numeros);
    }

    public boolean ordenaNumeros(int [] numeros) {
        if(numeros == null) return false;
        for (int i=0; i < numeros.length-1; i++ ) {
            int posMaior = i; //indice iniciando no 1 num
            int maior = numeros[i]; //pegando o num do ciclo
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j] > maior) {
                    posMaior = j;
                    maior = numeros[j];
                }
            }
            int temp = numeros[i];
            numeros[i] = maior;
            numeros[posMaior] = temp;
        }
        return true;
    }

    public void visualizar(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "   ");
        }
        System.out.println();
    }
}
