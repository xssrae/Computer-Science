import javax.swing.JOptionPane;
public class Teste {
    public static void main(String[] args) {
        int opcao, qtde, x;
        String num;
        boolean ok, achou;

        try {
            do {
                num = JOptionPane.showInputDialog (null, "Que tipo deseja usar? \n1 - Números inteiros \n2 - Palavras");
                opcao = Integer.parseInt(num);  // escolhendo o tipo de dados

                switch(opcao) {
                    case 1: 
                        num = JOptionPane.showInputDialog("Qtos números? "); //entrada da qtde de números
                        qtde = Integer.parseInt(num); // string => int

                        int [] numeros = new int [qtde]; // passando qtde para criar posições no vetor
                        for (int i=0; i < qtde; i++) {
                            num = JOptionPane.showInputDialog("Número "+(i));
                            numeros[i] = Integer.parseInt(num);
                        }
                        num = JOptionPane.showInputDialog("Qual número deseja pesquisar?");
                        x = Integer.parseInt(num);
                        achou = Busca.linear(x, numeros);
                        if (achou) {
                            JOptionPane.showMessageDialog(null, "Número presente na relação");
                            ok = true;
                            break;
                        }else {
                            JOptionPane.showMessageDialog(null, "Número não presente na relação.");
                            ok = true;
                            break;
                        }
                    case 2:
                        num = JOptionPane.showInputDialog("Quantas palavras? ");
                        qtde = 


                }
            }
        }
    }
}
