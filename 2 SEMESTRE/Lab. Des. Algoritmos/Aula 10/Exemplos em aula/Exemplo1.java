import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        int n = 3;
        Scanner leia = new Scanner(System.in);
        double media, soma = 0;
        double[] notas = new double[3];
        int i;
        String[] nomes = new String[3];


        for(i=0; i<=3; i++){
            System.out.print("Digite o nome do "+(i+1)+ "º aluno");
            nomes[i] = leia.next();
            System.out.println("Digite a nota do "+ nomes[i]);
            notas[i] = leia.nextDouble();
            soma += notas[i];
        }
        media = soma/n;
        System.out.println("A média da turma é " + media);
        for(i=0; i<nomes[i].length(); i++){
            if(notas[i]>media){
                System.out.println("Parabéns " + notas[i] + "vc ficou acima da média da turma");
            }
        }
    }
}
