package Aula3;
import java.util.Scanner;

public class LeituraDeUmVetorCScanner2 {

    public static void main(String[] args) {
        new LeituraDeUmVetor();  //executamos o construtor da classe
    }

    public LeituraDeUmVetorCScanner2() {   //metodo construtor da classe principal
        int N; //para guardar a qtde. verdadeira de elementos do vetor (tamanho)
        double vetor[];  //apenas declaramos o vetor, mas n�o reservamos mem�ria ainda

        Scanner sc = new Scanner(System.in);  //classe Scanner para leitura da entrada std (teclado)

        System.out.print("Digite a quantidade de valores que ser�o digitados: ");
        N = sc.nextInt();  //leitura da quantidade
        vetor = new double[N];  //alocamos (reservamos) mem�ria para N valores

        //leitura de dados
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor da posi��o " + i + ": ");
            vetor[i] = sc.nextDouble();  //leitura de um valor real
        }

        //visualizamos os dados guardados no vetor
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "posi��o " + i + ", " + vetor[i] + "\n";
        }
        System.out.println("\nValores armazenados no vetor: \n" + str);
        
        //outro exemplo, vamos calcular a m�dia dos valores que est�o 
        //guardados no vetor:
        double soma = 0;  
        for (int i = 0; i < N; i++) {
            soma += vetor[i];  
        }
        double media = soma/N;  //ou:    double media = soma/vetor.length; 
        System.out.println("\nA m�dia dos valores do vetor �: " + media);
        System.out.println("A m�dia dos valores do vetor �: " + soma/N);
        
        //determinar o maior valor do vetor
        double maior = vetor[0];  //suposi��o inicial
        for (int i = 1; i < N; i++) {
            if(vetor[i] > maior) maior = vetor[i];
        }        
        System.out.println("\nO maior valor guardado neste vetor �: " + maior);
        
    }

}
