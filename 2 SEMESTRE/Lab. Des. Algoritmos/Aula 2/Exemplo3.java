import javax.swing.JOptionPane;
public class Exemplo3{
    public void main(String []args){
        String nome;
        nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        System.out.println("Ola" + nome);
        JOptionPane.showMessageDialog(null, "Olaaa" + nome);
    }
}
