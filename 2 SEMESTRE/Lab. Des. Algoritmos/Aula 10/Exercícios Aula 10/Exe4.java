import java.util.Scanner;

public class Exe4 {
    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        String [] nomes = new String [10];
        double [][] salarios = new double [10][6];
        double [] medias = new double [10];
        double acum = 0;
        int i, j;
        
        for(i=0; i<10; i++){
            System.out.println("Funcionário "+(i+1)+" - Digite seu nome: ");
            nomes[i] = leia.next();
            
            for(j=0; j<6; j++){ //Para cada funcionário, entraram 6 valores de salário (referente ao semestre). Irão iterar com j.
                                                                   // dentro do i
                System.out.print("Mês " +(j+1)+ " - Informe seu salário: ");
                salarios[i][j] = leia.nextDouble();
                acum += salarios[i][j]; //pegando 6 salários de cada funcionário
            }
            medias[i] = acum/6;  //média salárial de CADA FUNCIONÁRIO, totalizando as 10 médias
        }
        System.out.println();
        System.out.println("Média salárial dos funcionários: \n");
        for(i=0; i <= 10; i++){
            System.out.println(); //quebra linha
            System.out.printf("\nMédia: %.2f" , medias[i]);
            System.out.print(" Funcionário: " + nomes[i]);
        }
    }
}