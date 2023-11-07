//By Ledón
package fila1;

public class Fila1 {

    public static void main(String[] args) {
        new Fila1();
    }

    public Fila1() {
        Queue fila = new Queue();

        if (fila.isEmpty()) {
            System.out.println("Inicialmente: a fila está vazia");
        }

        fila.enqueue("mesa");
        fila.enqueue("janela");
        fila.enqueue("estante");
        fila.enqueue("cadeira");
        fila.enqueue("notebook");
        
        if (!fila.isEmpty()) {
            System.out.println("Agora a fila não está vazia: " + fila.toString());
        }

        System.out.println("O valor na cabeça da fila é " + fila.peek());

        while (!fila.isEmpty()) {
            Object obj = fila.dequeue();
            System.out.println("Retirando o valor " + obj.toString() + " da fila");
        }

        System.out.println("Finalmente: " + fila.toString());
    }

}
