import javax.swing.JOptionPane;
public class Exe8 {
    public static void main(String[] args) {
        double notas, aprovados = 0, acum = 0, media;
        int i=1;
        while(i<=20){  // coloquei menos repetições para não estender muito o loop.
            notas = Double.parseDouble(JOptionPane.showInputDialog(null, i + " Aluno - Informe a nota: "));
            i++;
            acum += notas;
            
            if(notas >= 6.0){
                aprovados++;
            }
        }
        media = acum/10;
        JOptionPane.showMessageDialog(null, "Qtde de alunos aprovados: " + aprovados + "\nMédia das notas: " + media);
    }
}