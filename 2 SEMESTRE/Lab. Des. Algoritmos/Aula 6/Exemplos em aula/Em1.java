import java.util.Scanner;
public class Em1 {
    public static void main(String[]args) {
        int idade;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        if (idade >= 18){
            System.out.println("Você pode tirar CNH");
        }
        else{
            System.out.println("Você não pode tirar CNH");  
        }
    }
}