/* 6- Faça um programa que calcule e mostre a área de um triângulo a partir da leitura da
base e altura (em cm). Sabe-se que:
Área = (base * altura)/2 */

import javax.swing.JOptionPane;
public class Exe6 { 
    public static void main(String[] args) {

        double base, altura, area;

        JOptionPane.showMessageDialog(null, ("Calculo de Área do Trianguilo."));
        base = Double.parseDouble(JOptionPane.showInputDialog(null, ("Digite o tamanho da base:")));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, ("Digite o tamanho da altura:")));

        area = (base*altura)/2;

        JOptionPane.showMessageDialog(null, String.format("O valor da Área do triangulo é de: %.2f" , area , "cm"));
    }
}
