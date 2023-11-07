//Faça uma calculadora simples em Java que solicite ao usuário dois valores reais (a,
//b) e uma opção (1-Soma; 2-Subtração; 3- Divisão; 4- Multiplicação). Após, calcular e
//exibir o resultado conforme a opção selecionada.

import javax.swing.JOptionPane;
public class Em6 {
    public static void main(String[] args) {
        double multp, div;
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Diigte o primeiro valor"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Diigte o segundo valor"));
        int resp = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha qual calculo desejado: \n 1 - multiplicação \n2- Divisão"));

        if(resp == 1){
            multp = n1*n2;
            JOptionPane.showMessageDialog(null, String.format("Resultado = %.2f", multp));
        }
        else{
            div = n1/n2;
            JOptionPane.showMessageDialog(null, String.format("Resultado = %.2f", div));
        }
   }
}
