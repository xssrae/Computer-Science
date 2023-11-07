import java.util.Scanner;

import javax.swing.JOptionPane;
public class Exemplo3 {
    public static void main(String[] args) {
        String LOGIN = "raealves80@gmail.com";
        int SENHA = 12345;

        String login = JOptionPane.showInputDialog(null,"Email: ");
        int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Senha: "));

        if(!login.equals(LOGIN)){
            JOptionPane.showMessageDialog(null, "Usuário inválido.");
        }else if(senha != SENHA){
            JOptionPane.showMessageDialog(null, "Senha inválida.");
        }else{
            JOptionPane.showMessageDialog(null, "login com sucesso.");
        }


        
    }
}
