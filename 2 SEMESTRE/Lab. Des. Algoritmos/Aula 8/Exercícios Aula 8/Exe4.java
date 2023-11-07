import java.util.Scanner;
public class Exe4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i;
        double valores, acumulador = 0, contador = 0, media;
        for(i=0; i<=100; i++){
            System.out.println("Digite um valor diferente de 0: ");
            valores = leia.nextInt();
            acumulador += valores;
            contador += 1;
            if(valores == 0){
                break;
            }
        }
        media = acumulador/contador;
        System.out.printf("A média dos valores é: %.2f", media);
    }
}
