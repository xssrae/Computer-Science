/* 3- Escreva um programa para calcular o valor de uma prestação em atraso (prestacao).
Para isso, obtenha o valor da prestação (valorPrestacao), a porcentagem de multa pelo
atraso (multa) e a quantidade de dias de atraso (qtdeDias). Calcular e mostrar o valor
da prestação atualizado, sabendo que:
prestacao = valorPrestacao+(valorPrestacao*(multa/100)*qtdeDias) */

import javax.swing.JOptionPane;
public class Exe3{
    public static void main(String []args) {

        double prestacao, valorPrestacao, multa;
        int qtdeDias;

        valorPrestacao = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da prestação: "));
        multa = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da multa %: "));
        qtdeDias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a qtde de dias de atraso: "));

        prestacao = valorPrestacao + (valorPrestacao*(multa/100)* qtdeDias);

        JOptionPane.showMessageDialog(null, String.format("O valor de sua multa por atraso é de: %.2f" , prestacao));
    }
}
