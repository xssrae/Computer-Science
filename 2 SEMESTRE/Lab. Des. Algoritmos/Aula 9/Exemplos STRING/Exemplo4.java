import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog(null, "Informe o email: ");

        //solução 1
        String temp[];
        temp = email.split("@");
        System.out.println("Domínio: https://" + temp[1]);

        //solução 2
        int i = email.lastIndexOf("@")+1;
        System.out.println("Domínio: https://" + email.substring(i));
    }
}
