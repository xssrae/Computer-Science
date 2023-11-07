import javax.swing.JOptionPane;
public class Em2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));

        if(num%2 == 0){
            JOptionPane.showMessageDialog(null, "PAR");
        }
        else{
            JOptionPane.showMessageDialog(null,"IMPAR");
        }
    }
}
