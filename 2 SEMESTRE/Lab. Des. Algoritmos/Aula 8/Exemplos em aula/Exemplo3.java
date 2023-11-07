import javax.swing.JOptionPane;
public class Exemplo3 {
    public static void main(String[] args) {
        int i, num;
        String temp = "";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        for(i=0; i<=10; i++){
            temp += num + "x" + i + " = " + num*i + "\n";
        }
        JOptionPane.showMessageDialog(null, temp);
    }
}
