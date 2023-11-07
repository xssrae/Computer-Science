import java.util.Scanner;
public class Exemplo4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, i, fatorial;

        System.out.println("DIGITE UM NUMERO: ");
        n = leia.nextInt();
        fatorial = 1;
        for(i=1; i<=n; i++){
            fatorial = fatorial*i;
            System.out.println(fatorial);
        }
        if(n >= 0){
            System.out.println("FATORIAL É: " + fatorial);
        }else{
            System.out.println(n + "NÃO POSSUI FATORIAL");
        }
    }
}
