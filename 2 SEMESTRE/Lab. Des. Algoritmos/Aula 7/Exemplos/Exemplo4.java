import java.util.Scanner;
public class Exemplo4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int nota;
        String conceito;

        System.out.println("Digite a nota: ");
        nota = leia.nextInt();

        switch(nota){
            case 0: case 1: conceito = "E";
            break;
            case 2: conceito = "D";
            break;
            case 3: conceito = "C";
            break;
            case 4: conceito = "B";
            break;
            case 5: conceito = "A";
            break;
            default: conceito = "Inválido";
            }
            System.out.println("Conceito =" + conceito);
    }
}
