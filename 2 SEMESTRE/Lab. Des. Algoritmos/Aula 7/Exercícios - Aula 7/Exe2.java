import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) {
        int digito;
        String msg;
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o ultimo dígito da placa: ");
        digito = leia.nextInt();

        if(digito == 1 || digito == 2)
            msg = "Segunda-Feira";
        else if(digito == 3 || digito == 4)
            msg = "Terça-Feira";
        else if(digito == 5 || digito == 6)
            msg = "Quarta-Feira";
        else if(digito == 7 || digito == 8)
            msg = "Quinta-Feira";
        else
            msg = "Sexta-Feira";
        System.out.println("Rodízio na " + msg);
    }
}