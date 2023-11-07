import java.util.Scanner;
public class Exemplo5 {
    public static void main(String[] args) {
        int mes;
        String dia;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o mês: ");
        mes = leia.nextInt();

        switch(mes){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
            dia = "31";
            System.out.println("O mês têm " + dia + " dias");
            break;

            case 4:case 6:case 9:case 11:
            dia = "30";
            System.out.println("O mês têm " + dia + " dias");
            break;

            case 2: dia = "31";
            System.out.println("O mês têm " + dia + " dias");
            break;
        }
    }
}
