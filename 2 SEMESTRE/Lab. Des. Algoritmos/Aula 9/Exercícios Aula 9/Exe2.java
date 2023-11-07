import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String criptografada = "", fraseOriginal;
        int i;

        System.out.println("Digite uma frase para ser criptografada: ");
        fraseOriginal = leia.nextLine();

        for(i= fraseOriginal.length() - 1; 0 <= i; i--){
            criptografada += fraseOriginal.charAt(i);
        }
        System.out.println("Frase criptografada: " + criptografada);
    }
}