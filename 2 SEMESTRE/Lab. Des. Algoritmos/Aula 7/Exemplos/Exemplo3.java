import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        double altura, peso, imc;
        String categoria;
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o peso: ");
        peso = leia.nextDouble();
        System.out.println("Informe a altura: ");
        altura = leia.nextDouble();

        imc = peso / (altura*altura);

        if(imc < 20){
            categoria = "Abaixo do peso.";
        }else if(imc < 25){
            categoria = "Peso normal.";
        }else if(imc < 30){
            categoria = "Sobrepeso";
        }else if(imc < 40){
            categoria = "Obeso";
        }else{
            categoria = "Obeso mórbido";
        }
        System.out.println(categoria);

    }
}
