import javax.swing.JOptionPane;
public class Exe8 {
    public static void main(String[]args) {
        int vinteCinco = Integer.parseInt(JOptionPane.showInputDialog(null, "Moedas de 25: "));
        int dez = Integer.parseInt(JOptionPane.showInputDialog(null, "Moedas de 10: "));
        int cinco = Integer.parseInt(JOptionPane.showInputDialog(null, "Moedas de 5: "));
        
        valorCofre(vinteCinco, dez, cinco);
    }

    public static double valorCofre(int v, int d, int c) {
        double valorReais;
        valorReais = (v*0.25)+(d*0.10)+(c*0.05);
        JOptionPane.showMessageDialog(null, String.format("Valor total em Reais: %.2f", valorReais));

        return valorReais;
    }
}
