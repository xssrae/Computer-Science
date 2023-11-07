import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String verificacao = "", palavra;
        int i;

        System.out.println("Digite uma palavra: ");
        palavra = leia.next();

        for(i = palavra.length() - 1; 0 <= i; i--){
            verificacao += palavra.charAt(i);
        }
        if(verificacao.equals(palavra)){
            System.out.println("A palavra: '" + verificacao + "' é um Palíndromo" );
        }else{
            System.out.println("A palavra '" + verificacao + "' não é Palíndromo pois é diferente '" + palavra + "'");
        }
    }
}
