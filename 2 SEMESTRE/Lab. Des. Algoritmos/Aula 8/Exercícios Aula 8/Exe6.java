import java.util.Scanner;
public class Exe6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i;
        double num, positivos = 0, negativos = 0, menorNum = 0;
        System.out.println("Digite 10 números inteiros: ");

        for(i=0; i <= 10; i++){
            num = leia.nextDouble();

            if(num > 0){  //contando entradas de numeros positivos e negativos
                positivos++;
            }else{
                negativos++;
            }

            if(num < menorNum){  //verificando Menor número comparando com variável auxiliar e copiando valor de i
                menorNum = i;
            }
        }
        System.out.println("Qtde de números positivos digitados foi: " + positivos + "\nQtide de números negativos digitados foi: " + negativos + "\nO menor número é: " + menorNum);
    }
}

