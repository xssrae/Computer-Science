import javax.swing.JOptionPane;

public class Exe10 {
    public static void main(String[]args) {
        double valorReal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser convertido para Dólar"));
        double cotacao = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a cotação atual do Dólar: "));
        converteDolar(valorReal, cotacao);
    }
    
    public static double converteDolar(double vR, double c) {
        double valorDolar = vR/c;
        JOptionPane.showMessageDialog(null, String.format("Valor convertido para dólar: %.2f", valorDolar));
        return valorDolar;
    }
}