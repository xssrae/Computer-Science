import java.util.Scanner;

public class Treino1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String [] produtos = new String [5];
        double [] precos = new double [5];
        double [] aumentos = {};
        int [] codigos = new int [5];
        String [] produtosAcima = {};
        int indice = 0;
        int aux = 0;
        int i;

        for (i=0; i <= 5; i++) {
            System.out.print("Informe o nome do produto: ");
            produtos[i] = leia.next();
            System.out.print("Informe o código do produto: ");
            codigos[i] = leia.nextInt();
            System.out.print("Informe o valor em R$: ");
            precos[i] = leia.nextDouble();

            if ((codigos[i] % 2==0) && (precos[i] >= 1000)) {
                aumentos[i] = precos[i] + (precos[i]*0.2);
                indice = i;
                aux++;
            }else if ((codigos[i] % 2==0) || (precos[i] >= 1000) ) {
                aumentos[i] += precos[i] + (precos[i]*0.15);
                indice = i;
                aux++;
            }else{
                continue;
            }
            produtosAcima[i] += produtos[indice]; //passando o indice do produto que sofreu alteração de preço
        }

        
    }
}