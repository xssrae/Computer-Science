import javax.swing.JOptionPane;
public class Exercicio5 {
    public static void main(String[] args) {
        double produto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));
        int parcela = Integer.parseInt(JOptionPane.showInputDialog("Informe a parcela desejada: "));
        double prestacao;
        
        if(parcela == 2 || parcela == 3){
            prestacao = (produto/parcela) + (produto*0.1);
            JOptionPane.showMessageDialog(null, String.format("Valor final da prestação: %.2f", prestacao));
        }else{
            prestacao = (produto/parcela) + (produto*0.2);
            JOptionPane.showMessageDialog(null, String.format("Valor final da prestação: %.2f", prestacao));
        }
    }
}
