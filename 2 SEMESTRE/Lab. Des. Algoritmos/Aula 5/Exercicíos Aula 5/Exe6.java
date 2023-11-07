import javax.swing.JOptionPane;
public class Exe6 {
    public static void main(String [] args) {
        double produto = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do produto: "));
        calcDesconto(produto);
    }
    
    public static double calcDesconto(double p) {
        double desconto = p - (p*0.09);
        JOptionPane.showMessageDialog(null, "Valor do produto aplicado o desconto de 9%: " + desconto);
        return desconto;
    }
}
