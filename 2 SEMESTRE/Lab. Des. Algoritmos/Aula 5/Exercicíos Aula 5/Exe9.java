import javax.swing.JOptionPane;
public class Exe9 {
    public static void main(String[]args) {

        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura: "));
        clacIMC(peso, altura);
    }

    public static double clacIMC(double p, double a) {
        double IMC;
        IMC = p/(a*a);

        JOptionPane.showMessageDialog(null, String.format("Seu IMC é: %.2f", IMC));
        return IMC;
    }
}
