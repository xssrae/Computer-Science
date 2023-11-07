package Exercicios.A2;
import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        new Exercicio2();
    }
    
    public Exercicio2() {
        ArrayList lista = new ArrayList();
        lista.add(4.3); lista.add(6.1);lista.add(0.1);lista.add(1.9);lista.add(2.4);lista.add(7.2);lista.add(5.5);
        
        System.out.println("Vetor original: ");
        for(int i=0; i < lista.size(); i++) {
            System.out.print(lista.get(i)); /*exibindo a lista por meio do get, levando em conta que ele consegue
                                                      acessar itens contidos nos arraylist*/
            System.out.print(" | ");                 
        }
        inverteElemento(lista);
    }
    
    public void inverteElemento(ArrayList lista) {
        ArrayList invertidos = new ArrayList(); //nova lista de valores
        int N = lista.size(); //7 elementos

        while (lista.size() > 1) {
            N -= 1; //decrementando 1 de N para virar índice e permanecer diminuindo nos próximos ciclos
            invertidos.add(lista.get(N)); //adicionando os itens de lista em invertidos por meio do método get da classe ArrayList
            lista.remove(N);//removendo da lista o item
        }

        invertidos.add(lista.get(0)); //pegando o ultimo item que falta
        lista.clear();//limpando a lista totalmente

        for (int i=0; i < invertidos.size(); i++) {
            lista.add(invertidos.get(i));//adicionando novamente todos os itens na lista original
        }
        
        System.out.println("\nVetor invertido: ");
        for(int j=0; j<lista.size(); j++) {
            System.out.print(lista.get(j));//exibindo a lista invertida, também por meio do get
            System.out.print(" | ");
        }
    }
}