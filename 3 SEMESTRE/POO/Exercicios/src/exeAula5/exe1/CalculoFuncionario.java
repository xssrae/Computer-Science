/*
 * ALUNA: Raquel Alves Fontes
 * RGM: 30109884
*/
package exeAula5.exe1;

public class CalculoFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(2332, 1200, "Porteiro");

        f1.exibeFuncionario();
        f1.calculaAumento(5);
        System.out.println("--------------------------");

        Funcionario f2 = new Funcionario();
        f2.exibeFuncionario();
        f2.calculaAumento(20);
    }
}