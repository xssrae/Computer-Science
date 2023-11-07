import javax.swing.JOptionPane;

public class Exe3 {
    public static void main(String [] args) {
        double totalAReceber;
        String nome = JOptionPane.showInputDialog(null, "Nome do vendedor: ");
        double salarFix = Double.parseDouble( JOptionPane.showInputDialog(null, "Salário fixo: "));
        int totalVendas = Integer.parseInt( JOptionPane.showInputDialog(null, "Total de vendas"));

        totalAReceber = salarFix + (0.05*totalVendas);

        JOptionPane.showMessageDialog(null, String.format(nome,"O total a receber: %.2f", totalAReceber));
    }
}