package Aula3_Exercicios;

public class TesteConta {
        public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();

        conta1.agencia = "Itau";
        conta1.saldo = 5500;
        conta1.limite = 3000;
        conta1.tipo = 'C';


        conta1.imprimeDados();
        conta1.depositar(40);
        conta1.imprimeDados();
        conta1.sacar(70000);

    }
}
