package exe2;

public class ContaCorrente {
    String agencia;
    float saldo;
    float limite;
    char tipo;
  
    public ContaCorrente() {}

    public ContaCorrente(String ag, float sal, char t) {
        this.agencia = ag;
        this.saldo = sal;
        this.tipo = t;
    }

    public ContaCorrente(String ag, float sal, float lim, char t) {
        this.agencia = ag;
        this.saldo = sal;
        this.limite = lim;
        this.tipo = t;
    } 
    
    public void depositar(float valor) {
        this.saldo += valor;
    }
    
    public float sacar(float valor) {
        if (this.saldo < valor) {
            System.out.print("------------------------------------- \nTentativa de saque: Não foi possível sacar.");
        } else {
            this.saldo -= valor;
        }
        
        return saldo;
    }
    
    public void imprimeDados()  {
        System.out.println("-------------------------------------");
        System.out.println("Conta: " + this.agencia);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }
}
