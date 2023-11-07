import java.util.Random;
public class Treino2 {        
    public static void main(String[] args) {
        int [][] numAleatorios = new int [4][4];
        Random numRandom = new Random();
        int i,j;

        for (i=0; i < numAleatorios.length; i++) {
            for (j=0; j < numAleatorios[i].length; j++) { //!! ref i pois j(i) (jxi = j linha; i coluna);
                numAleatorios[i][j] = numRandom.nextInt(100);//numeros aleatórios até 100
            }
        }

        int maior = 0, linha = 0, coluna = 0;

        for (i=0; i < numAleatorios.length; i++) {
            for (j=0; j < numAleatorios[i].length; j++) {
                if (numAleatorios[i][j] > maior) {
                    maior = numAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Maior num: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);

        for (i=0; i<numAleatorios.length; i++) {
            for (j=0; j<numAleatorios[i].length; j++) {
                System.out.print(numAleatorios[i][j] + " "); //dando espaçamento
            }
            System.out.println(); //trocando de linha
        }
    }        
}
