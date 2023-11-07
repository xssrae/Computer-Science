import javax.swing.JOptionPane;
public class Exe9 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Escolha o tipo de diária: ");
        char tipoDiaria = JOptionPane.showInputDialog(null,
        "S - QUARTO SIMPLES: R$ 255,50 < \nD - QUARTO DUPLO - R$ 305,50 < \nT - QUARTO TRIPLO - R$ 360,50 <").charAt(0);
        int qtdeDiarias = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de diárias desejadas: "));
        double valoraPagar;
        

        if(tipoDiaria != 'S' && tipoDiaria != 'D' && tipoDiaria != 'T'){
            JOptionPane.showMessageDialog(null,"Tipo de diária inválido");
        }else{
            if(tipoDiaria == 'S'){
                valoraPagar = 255.50*qtdeDiarias;
            }else if(tipoDiaria == 'D'){
                valoraPagar = 305.50*qtdeDiarias;
            }else{
                valoraPagar = 360.50*qtdeDiarias;
            }
            JOptionPane.showMessageDialog(null, String.format("O valor a pagar pelas diárias é: %.2f", valoraPagar));
        }
    }
}
