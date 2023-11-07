import javax.swing.JOptionPane;
public class Exe1{
    public static void main(String[] args) {
        int cargo = Integer.parseInt(JOptionPane.showInputDialog(null, "Código do cargo: \n1 - Escrituário \n2 - Scretário \n3 - Caixa \n4 - Gerente \n5 - Diretor"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário: "));
        double aumento, salarioF = 0;

        switch(cargo){
            case 1: aumento = salario*0.5; 
                    salarioF = salario+aumento;
            break;
            case 2: aumento = salario*0.35; 
                    salarioF = salario+aumento;
            break;
            case 3: aumento = salario*0.2; 
                    salarioF = salario+aumento;
            break;
            case 4: aumento = salario*0.1; 
                    salarioF = salario+aumento;
            break;
            default: aumento = salario;
        }
        JOptionPane.showMessageDialog(null, String.format("Valor de seu aumento será R$%.2f", aumento));
        JOptionPane.showMessageDialog(null, String.format("Salário final: R$%.2f", salarioF));
    }
}