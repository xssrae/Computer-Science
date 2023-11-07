package Exercicios.A7;
import java.util.Stack;

public class PilhaVeiculo {
    public static void main(String[] args) {
        // Criando alguns objetos de veículos
        Veiculo v1 = new Veiculo("ABC1234", "Fiat", "Palio", 2010);
        Veiculo v2 = new Veiculo("DEF5678", "Chevrolet", "Cruze", 2018);
        Veiculo v3 = new Veiculo("GHI9101", "Volkswagen", "Gol", 2005);
        
        // Criando a pilha e inserindo os veículos
        Stack<Veiculo> pilha = new Stack<>();

        pilha.push(v1);
        pilha.push(v2);
        pilha.push(v3);
        
        // Retirando e mostrando os veículos da pilha
        while (!pilha.empty()) {
            Veiculo veiculo = pilha.pop();
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano de fabricação: " + veiculo.getAnoFabricacao());
            System.out.println("--------------------");
        }
    }
}