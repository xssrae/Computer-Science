import java.util.Random;
import java.util.Scanner;
public class Treino3 {
    public static void main(String[] args) {
        Random numRandom = new Random();
        Scanner leia = new Scanner(System.in);
        int [][] matriz = new int [10][10];
        int maior = 0, menor = 0, i, j;


        for (i=0; i < matriz.length; i++) {
            for (j=0; j < matriz.length; j++) {
                System.out.println("Nº: " + i +"-"+ j);
                matriz[j][i] = numRandom.nextInt(100);
                System.out.println("");
                matriz[j][i] = leia.nextInt();
            }
        }

        for (i=0; i < matriz[5].length; i++) {
            if (matriz[5][i] > maior) {
                maior = matriz[5][i];
            }
            for (j=0; j < matriz[6].length; j++) {
                if (matriz[i][6] < menor) {
                    menor = matriz[i][6];
                }
            }
        }

        for (i=0; i < matriz.length; i++) {
            for (j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); //dando espaçamento
            }
            System.out.println(); //trocando de linha_
        }
        System.out.println("Maior da coluna 7: " + maior);
        System.out.println("Menor da linha 5: " + menor);
    }
}
