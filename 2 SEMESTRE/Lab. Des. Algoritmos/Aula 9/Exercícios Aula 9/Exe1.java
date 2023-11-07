import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String frase, palavra, fraseNova;

        System.out.println("Digite uma frase com a palavra ESCOLA: ");
        frase = leia.nextLine();
        System.out.println("Digite a palavra que deseja ser trocada: ");
        palavra = leia.nextLine();

        fraseNova = frase.replace("escola", palavra);

        System.out.println("Nova frase: '" +fraseNova+ "'");
    }
}