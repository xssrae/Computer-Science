/*
 * Escreva um programa em Java que obtenha uma temperatura em graus Celsius,
 * calcule e mostre a respectiva temperatura nas escalas Fahrenheit e Kelvin. Utilize as
 * fórmulas abaixo: tf = 1,8 * tc + 32
 *                  Tk = tc + 273
*/
import javax.swing.JOptionPane;
public class Exe5 {
    public static void main(String [] args) {
        double tC, tF, tK;

        tC = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em Celsius a ser convertida: "));

        tF = (1.8 * tC )+ 32;
        tK = tC + 273;
        JOptionPane.showMessageDialog(null, String.format("Valor em Fahrenheit: %.2f",tF));
        JOptionPane.showMessageDialog(null, String.format("Valor em Kelvin: %.2f",tK));   
    }
}
