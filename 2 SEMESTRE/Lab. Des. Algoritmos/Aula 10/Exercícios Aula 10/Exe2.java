import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [] vetor = new int [10];
        int i, maiorNum = 0;

        System.out.println("Digite 10 números INTEIROS: ");
        for(i=0; i<10; i++){
            vetor[i] = leia.nextInt(); //entrada de valores no vetor
            if(vetor[i] > maiorNum){
                maiorNum = vetor[i];  //pegando o primeiro num e comparando com o prox num para saber se é o maior
            }
        }

        for(i=0; i < vetor.length; i++){
            vetor[i] = vetor[i]/maiorNum;  //dividindo números do vetor pelo maior Num
            System.out.printf("Resultado obtido: %d \n", vetor[i]);
        }
    }
}
