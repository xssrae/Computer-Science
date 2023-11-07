package Aula3;
import java.util.Scanner;

public class LeituraDeUmVetorCScanner {

    public static void main(String[] args) {
        new LeituraDeUmVetor();
    }

    public LeituraDeUmVetorCScanner() {
        int N;
        double vetor[];

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores que ser�o digitados: ");
        N = sc.nextInt();
        vetor = new double[N];  //alocamos mem�ria para N valores

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor da posi��o " + i + ": ");
            vetor[i] = sc.nextDouble();
        }

        String str = "";
        for (int i = 0; i < N; i++) {
            str += "posi��o " + i + ", " + vetor[i] + "\n";
        }
        System.out.println("\nValores armazenados no vetor: \n" + str);
    }

}
