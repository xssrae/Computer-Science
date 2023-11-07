/*
 * 2- Escreva um programa em Java que solicite ao usuário o salário atual e mostre o
 * salário acrescido de 5% de comissão.
*/
import javax.swing.JOptionPane;
public class Exe2 {
    public static void main(String [] args){

        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salário base: "));
        double salarioComissao = salarioBase + (salarioBase*0.05);

        JOptionPane.showMessageDialog(null,
        String.format("Salário a receber = %.2f", salarioComissao));
    }
}