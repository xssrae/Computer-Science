import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        double nota, media, soma;
        int i, n;
        Scanner leia = new Scanner(System.in);
        soma = 0;
        n = 4;

        for(i=1; i<=n; i++){
            System.out.println("Digite a "+i+" nota do aluno");
            nota = leia.nextDouble();
            soma += nota;
        }
        media = soma/n;
        System.out.println("Média = " + media);
    }
}
