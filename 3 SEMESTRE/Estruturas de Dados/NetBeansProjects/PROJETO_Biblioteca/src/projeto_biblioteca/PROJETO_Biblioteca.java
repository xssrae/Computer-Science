package projeto_biblioteca;

import javax.swing.JOptionPane;
public class PROJETO_Biblioteca {
        public static void main(String[] args) {
                int opcao = 0;
                String opcoes =
              "\n1- Cadastre-se"+
              "\n2- Logar"+
              "\n3- Título"+
              "\n4- Código"+
              "\n5- Gênero"+
              "\n6- Finalizar"+
              "\n\nSelecione a opção: ";
        
        
            while (opcao!= 6){
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null,opcoes,
                    "Biblioteca Digital",JOptionPane.INFORMATION_MESSAGE));
               
                    switch(opcao)
                    {
                    case 1: // cadastrar cliete pedindo nome de usuario e senha!
                            JOptionPane.showMessageDialog(null, "1-Cadastre-se");
                            break;
        
                     case 2: //logar com a senha e usuarios prontos!
                            JOptionPane.showMessageDialog(null, "2-Logar");
                            break;
        
                    case 3: // pesquisar por nomes de livros
                            JOptionPane.showMessageDialog(null, "3- Título");
                            break;
        
                    case 4:// pesquisar os livros por códigos
                            JOptionPane.showMessageDialog(null, "4-Código");
                            break;
        
                    case 5: // pesquisar livros por genero
                            JOptionPane.showMessageDialog(null, "5- Gênero");
                            break;
                    }
                }
        }

        public void realizarLogin() {
                
        }
}