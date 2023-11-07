package Filas.Exe1;


public class Fila1 {

    private int total = 0;	//Total de Elementos na fila (convenção: 0 se a fila estiver vazia)
    private int head = -1;  //Começo da Fila1  (convenção: -1 se a fila estiver vazia)
    private int tail = -1;	//Final da fila (convenção: -1 se fila vazia)
    private Object memo[];  //Vetor para armazenar os elementos
    private int MAX;        //Capacidade máxima da Fila1 Estática

    //Inicializa a Fila1 em estado vazia
    public Fila1() {
        MAX = 10;
        memo = new Object[MAX];
        total = 0;
        head = -1;
        tail = -1;
    }

    //Verifica se a fila está vazia
    public boolean isEmpty() {
        return (total == 0);
    }

    //Verifica se a fila está cheia (se o vetor está cheio)
    public boolean isFull() {
        return (total == MAX);
    }

    //Insere um elemento na fila
    public Object enqueue(Object x) {
        if (!isFull() && x != null) {  // pré-condições
            if (++tail >= MAX) {
                tail = 0;
            }
            if (head == -1) head = tail;
            memo[tail] = x;
            total++;
            return x;
        } 
        else return null;
    }

    //Remove um elemento do início da fila
    public Object dequeue() {
        if (!isEmpty()) {
            Object objeto = memo[head];
            if (++head >= MAX) {
                head = 0;
            }
            total--;
            if (total == 0) {
                head = -1;
                tail = -1;
            }
            return objeto;
        } else {
            return null;
        }
    }

    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar.
    public Object peek() {
        if (!isEmpty()) {
            return (memo[head]);
        } else {
            return null;
        }
    }

    //Retorna o objeto que está no início da fila (o primeiro da fila), sem eliminar.
    //Mostramos aqui outra estratégia para verificar os casos de erro: lançar uma exception.
    //Veja um exemplo de utilização na classe principal FilaEstaticaSequencial.
    public Object peek2() throws Exception {
        if (!isEmpty()) {
            return (memo[head]);
        } else {
            throw new Exception("a fila está vazia");
        }
    }

    //Retorna o conteúdo da Fila1
    public String toString() {
        if (!isEmpty()) {
            String saida = "";
            int pos = head;
            for (int i = 1; i <= total; i++) {
                saida += memo[pos].toString();
                if (i != total) {
                    saida += ", ";
                }
                pos++;
                if (pos >= MAX) {
                    pos = 0;
                }
            }
            return ("F: " + " [ " + saida + " ]");
        } else {
            return ("F: [ ]");
        }
    }

    public int getMAX() {
        return MAX;
    }

    public int getHead() {
        return head;
    }
}
