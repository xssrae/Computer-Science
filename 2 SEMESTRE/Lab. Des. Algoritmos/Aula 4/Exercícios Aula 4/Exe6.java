import javax.swing.JOptionPane;
public class Exe6 {
    public static void main(String [] args) {
        int cem, cinquenta, vinte, dez, cinco, dois, um;
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Entrada de valor: "));

        cem = (int)(valor / 100);
        valor = valor % 100;
        cinquenta = (int)(valor / 50);
        valor = valor % 50;
        vinte = (int)(valor / 20);
        valor = valor % 20;
        dez = (int)(valor / 10);
        valor = valor % 10;
        cinco = (int)(valor / 5);
        valor = valor % 5;
        dois = (int)(valor / 2);
        valor = valor % 2;
        um = (int)(valor / 1);
        valor = valor % 1;

        JOptionPane.showMessageDialog(null,"Notas de R$100,00: " + cem + "\nNotas de R$50,00: " + cinquenta + "\nNotas de R$20,00: " + vinte + "\nNotas de R$10,00: " + dez + "\nNotas de R$5,00: " + cinco + "\nNotas de R$2,00: " + dois + "\nMoedas de de R$1,00: " + um);
    }
}