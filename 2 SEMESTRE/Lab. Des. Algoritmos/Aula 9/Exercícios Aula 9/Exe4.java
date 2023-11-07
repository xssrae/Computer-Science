import java.util.InputMismatchException;
import java.util.Scanner;
public class Exe4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double compraDesconto = 0;
        double compra;
        try{
            System.out.println("Informe o total da compra: ");
            compra = leia.nextDouble();

            if(compra >= 200){
                compraDesconto = compra - (compra*0.2);
                System.out.println("Compra ganhou um desconto de 20%");
            }else{
                compraDesconto = compra;
                System.out.println("Compra não obteve desconto");
            }
            System.out.printf("Valor a pagar: %.2f" , compraDesconto);
    
        }catch(NumberFormatException erro1){
            System.out.println("Valor digitado incorretamente.");
        }catch(InputMismatchException erro2){
            System.out.println("Não é um número ou valor foi digitado incorretamente.");
        }
    }
}