import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i=0, soma = 0, media, acima = 0;
        int qtdeN;

        System.out.println("Digite a qtde de números para o vetor: ");
        qtdeN = leia.nextInt();
        int [] vetor = new int [qtdeN];
        
        while(i < vetor.length){  //preenchendo o vetor com números ditados - tamanho conforme escolhido em "qtdeN";
            System.out.print("Digite os números: ");
            vetor[i] = leia.nextInt(); 
            i++;
        }

        for(i=0; i < vetor.length; i++){//iterando vetor completo para somar todos os números
            soma += vetor[i];
        }
        media = soma/qtdeN;//media de todos os números;

        for(i=0; i < vetor.length; i++){ //agora iterando novamente o vetor para verificar números Acima da média;
            if(vetor[i] > media){
                acima++;
            }
        }
        System.out.println("Média dos números digitados: " + media);
        System.out.println("Qtde de números acima da média: " + acima);
    }
}
