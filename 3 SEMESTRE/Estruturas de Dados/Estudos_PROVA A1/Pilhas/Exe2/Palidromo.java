package Pilhas.Exe2;
import java.util.Stack;
import java.util.Scanner;

public class Palidromo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String palavra = "", resp= "";
        Stack <String> pilha = new Stack(); //Utilizando a API Stack

        System.out.println("Iniciando Pilha de PALIDROMES. \nDeseja adicionar uma palavra? \n'S'- SIM 'N'- NÃO");
        while(resp.equals("S")){
            palavra = leia.nextLine().toLowerCase();
            verificaPalidrome(palavra, pilha);
        }
        
        if(resp.toLowerCase().equals("N")){
            pilha.toArray();
        }
    }

    public static void verificaPalidrome(String palavra, Stack<String> pilha) {
        int tamanho = palavra.length();
        String palavraInvertida = "";

        for(int i=tamanho-1; i>=0; i--){
            palavraInvertida += palavra.charAt(i);
        }

        if(palavra.equals(palavraInvertida)){
            System.out.println("Palavra é Palidrome.");
            pilha.add(palavra);
        }else{
            System.out.println("Palavra não é palidrome.");
        }
    }

}
