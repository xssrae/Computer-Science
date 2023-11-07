import java.util.Scanner;
public class Motivacao{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0;
        String  parabens = "Parabens";
        double nota1, nota2, nota3, media;
        System.out.println("Informe a nota: ");

        while(i<= 3){
            nota1 = leia.nextDouble();
            nota2 = leia.nextDouble();
            nota3 = leia.nextDouble();

            media = (nota1 + nota2 + nota3)/3;

            
            if(nota1 >= media){
                System.out.println("Aluno 1" + parabens);
            }else if(nota2 >= media){
                System.out.println("Aluno 2" + parabens);
            }else{
                System.out.println("Aluno 3" + parabens);
            }
        }
    }

}