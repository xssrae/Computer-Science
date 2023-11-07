package Pilhas.Exe3;

public class Pilha2 {
    private int topo;
    private int MAX = 10;
    private Object memo[];


    public Pilha2 (){
        topo = -1;
        memo = new Object[MAX];//Pilha que armazenará 10 numeros
    }

    //Método para inserir valor na Pilha
    public Object push(Object x) {
        if(!isFull() && x!= null) {
            memo[++topo]=x;
            return x;
        } else return null;
    }

    //Método para retornar o conteúdo da Pilha
    public String toString() {
        if(!isEmpty()) {
            String msg = "";
            for(int i=0; i<= topo; i++){
                msg += memo[i].toString();
                if(i != topo) msg += ", "; //separando os números a portir do topo, adicionando vírgula na exibição
            }
            return ("PILHA: [" + msg + "]");
        }
        else return "Pilha vazia!";
    }

    //Método para retornar o Topo da Pilha e >removê-lo<
    public Object pop() {
        if(!isEmpty()) {
            return memo[topo--];
        } else return null;
    }

    //Método para retornar o tpo da Pilha >sem removê-lo<
    public Object top() {
        if(!isEmpty()) return memo[topo];
        else return null;
    }

    //Método que verifica se a pilha está vazia, O(1)
    public boolean isEmpty() {
        return(topo==-1);
    }
    //Método que verifica se a pilha está cheia, O(1)
    public boolean isFull() {
        return(topo==MAX-1);
    }

    //Método para ficar disponível a capacidade máxima da pilha para visualização e controle do loop
    public int getMAX() {
        return MAX;
    }
}

