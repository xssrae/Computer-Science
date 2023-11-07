import javax.swing.JOptionPane;
public class Exercício3 {
    public static void main(String[] args) {
        String turno = JOptionPane.showInputDialog("Turno de trabalho: \nN - noturno \nD - Diurno").toUpperCase();
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabalhadas"));
        double valorHora;

        if(turno == "N"){
            valorHora = horas*45;
            JOptionPane.showMessageDialog(null, String.format("Salário final: %.2f", valorHora));
        }else{
            valorHora = horas*37.50;
            JOptionPane.showMessageDialog(null, String.format("Salário final: %.2f", valorHora));
        }
    }
}
