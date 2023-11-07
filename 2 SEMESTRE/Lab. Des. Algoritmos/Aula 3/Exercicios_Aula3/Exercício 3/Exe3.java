/*
 * 3- Escreva um programa em Java que solicite ao usuário a distância entre duas
 * cidades e o tempo de viagem. O programa deverá calcular e exibir a velocidade média
 * de um carro que vai de uma cidade para outra. Ultilize a fórmula: Vm = distancia / tempo
*/

import java.util.Scanner;
public class Exe3 {
    public static void main(String [] args){
        int km, tempo, velMedia;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a distância em Km: ");
        km = leia.nextInt();
        System.out.print("Digite o tempo da viagem: ");
        tempo = leia.nextInt();

        velMedia = km/tempo;
        System.out.print("A velocidade média entre as cidades é de:" + velMedia + "Km/h");
    }
}
