import javax.swing.JOptionPane;
public class Exercicio1 {
    public static void main(String[] args) {
        double compra = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor total da compra: "));
        double desconto;

        if(compra >= 200.00){
            desconto = compra - (compra*0.2);
            JOptionPane.showMessageDialog(null, "Compra com 20% de desconto: \nR$" + desconto);
        }
        else{
            JOptionPane.showMessageDialog(null, "A compra não possui desconto.");
        }
    }
}
 