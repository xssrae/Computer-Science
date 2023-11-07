/*4- Faça um programa que receba o salário de um funcionário, calcule e mostre o novo
salário, sabendo-se que este sofreu um aumento de 25%.*/

import javax.swing.JOptionPane;
public class Exe4 {
    public static void main(String []args) {
        
        double salario, salarioFinal;

        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salario: "));
        salarioFinal = salario + (salario*0.25); /*Acrécimo do valor de 25% sobre o s*/

        JOptionPane.showMessageDialog(null, String.format("O salário final é: %.2f" , salarioFinal));
    }
}
