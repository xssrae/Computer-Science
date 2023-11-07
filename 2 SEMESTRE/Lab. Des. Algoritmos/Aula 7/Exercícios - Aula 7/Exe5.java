import java.util.Scanner;
public class Exe5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double precoProduto, vendaMensal, novoValor;
        
        System.out.println("Informe o valor do produto: ");
        precoProduto = leia.nextDouble();
        System.out.println("Informe a venda média mensal: ");
        vendaMensal = leia.nextDouble();

        if(vendaMensal >= 1200 || precoProduto >= 80){
            novoValor = precoProduto - (precoProduto*0.2);
        }else{
            if((vendaMensal >= 500 && vendaMensal < 1200) || (precoProduto >= 30 && precoProduto < 80))
                novoValor = precoProduto + (precoProduto*0.15);
            else
                novoValor = precoProduto + (precoProduto*0.1);
        }
        System.out.printf("O novo valor do produto será: R$ %.2f", novoValor);
    }
}
