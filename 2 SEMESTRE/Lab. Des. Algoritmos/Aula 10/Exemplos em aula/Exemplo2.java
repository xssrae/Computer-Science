import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double [] salarios = new double[10];
        double soma = 0, media, maiorS = 0, menorS=0;
        int i;

        for(i=0; i<10; i++){
            System.out.println("Funcionario "+(i+1)+": Informe seu salário: ");
            salarios[i] = leia.nextDouble();
            soma += salarios[i];
        }
        media = soma/10;

        System.out.println(media);

        for(i=0; i < salarios.length; i++){
            if(salarios[i] < 850)
                menorS ++;
            if(salarios[i] > maiorS)
                maiorS += salarios[i];
        }

        System.out.printf("Maior salário informado: %.2f" , maiorS);
        System.out.println("Qtide de salários < R$850,00: " + menorS);

    }
}
