//Crie um algoritmo e um programa em Java que solicite ao usuário três valores
//inteiros (A, B e C) e verifica se o valor armazenado em B é o menor.

import javax.swing.JOptionPane;
public class Em5{
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(null, "C: "));

        if(a > b && b < c){
            JOptionPane.showMessageDialog(null, "O número armazenado em B é o menor");
        }
        else{
            JOptionPane.showMessageDialog(null, "O número armazenado em B não é o menor.");
        }



    }
}