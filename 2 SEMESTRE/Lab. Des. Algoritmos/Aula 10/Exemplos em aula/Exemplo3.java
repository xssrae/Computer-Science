import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i;
        int [] num = new int [4];

        for(i=0; i<4; i++){
            System.out.println("Digite o " +(i+1)+"º valor");
            num[i] = leia.nextInt();
        }
        for(int id : num){
            
        }
    }
}
