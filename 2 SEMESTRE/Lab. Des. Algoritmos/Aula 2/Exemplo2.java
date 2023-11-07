import java.util.Scanner; /*Scanner = Console para debugs para entradas e saidas*/

public class Exemplo2 {
     public static void main(String args []){  /*Função principal*/
        int idade; /*Declaração de variáveis*/
        int anoNascimento; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Qual sua idade?: ");
        idade = sc.nextInt(); /*Entrada de dados*/
        anoNascimento = 2022 - idade;
        System.out.println("Você nasceu no ano de" + anoNascimento);
  }
}
