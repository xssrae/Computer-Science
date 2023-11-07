import javax.swing.JOptionPane;
public class Exemplo2 {
    public static void main(String[] args) {
        double nota, freq;

    nota = Double.parseDouble(JOptionPane.showInputDialog("INFORME A NOTA: "));
    freq = Double.parseDouble(JOptionPane.showInputDialog("INFORME A FREQUENCIA: "));
    if(freq < 75){
        JOptionPane.showMessageDialog(null, "REPROVADO POR FALTA.");
    }else if(nota < 6){
        JOptionPane.showMessageDialog(null, "REPROVADO POR NOTA");
    }else{
        JOptionPane.showMessageDialog(null,"APROVADO");
    }
    }
}
