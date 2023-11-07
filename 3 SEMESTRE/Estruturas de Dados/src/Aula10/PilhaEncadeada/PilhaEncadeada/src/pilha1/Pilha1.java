package pilha1;

public class Pilha1 {

    public static void main(String[] args) {
        new Pilha1();
    }
    
    public Pilha1() {
        
        Pilha pilha1 = new Pilha();  // cria uma pilha, inicialmente vazia        
        pilha1.push(5);
        pilha1.push(7);
        pilha1.push(9);
        pilha1.push(12);        
        pilha1.push(4);        
        System.out.println("O valor no topo da pilha é " + pilha1.top().toString() );  
        while( !pilha1.isEmpty() ) { // repetir enquanto a pilha não estiver vazia
                System.out.println("Retirado o valor " + pilha1.pop().toString() + " da pilha");	
        }        
        
        /*
        Pilha pilha2 = new Pilha();  // cria uma pilha, inicialmente vazia        
        pilha2.push(new Aluno(123, "Nicolas", "CCP", 9.2f));
        pilha2.push(new Aluno(456, "Renata", "ADS", 5.8f));
        pilha2.push(new Aluno(789, "Luiz", "CCP",6.5f));
        pilha2.push(new Aluno(123, "Vanda", "ARQ", 9.5f));        
        System.out.println("O valor no topo da pilha é " + pilha2.top().toString() );  
        while( !pilha2.isEmpty() ) { // repetir enquanto a pilha não estiver vazia
                System.out.println("Retirado o valor " + pilha2.pop().toString() + " da pilha");	
        }
       */

    }
    
}
