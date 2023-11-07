import java.util.Scanner;
public class Em3 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        nota1 = leia.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = leia.nextDouble();

        media = (nota1+nota2)/2;

        if (media >= 6.0){
            System.out.printf("Aprovado. \nMédia: %.2f", media);
        }
        else{
            System.out.printf("Reprovado. \nMédia: %.2f", media);
        }

    }
    
}
