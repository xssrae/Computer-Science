import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
public class Exe7 {
    public static void main(String[] args) {
        double alturaF = 0, contF = 0, alturaM = 0, contM = 0, mediaF, mediaM;
        while(true){
            String sexo = JOptionPane.showInputDialog(null, "Informe o sexo: \nM - Masculino \nF - Feminino \n(C - CONCLUIR)").toUpperCase();
            double alturas = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura: "));        

            if(sexo.equals("f")|| sexo.equals("F")){
                alturaF += alturas;   // acumulando alturas dos dois grupos separadamente
                contF++;   //contando entradas - mulheres
            }else if(sexo.equals("m")|| sexo.equals("M")){
                alturaM += alturas;  // acumulando alturas dos dois grupos separadamente
                contM++;    //contando entradas - homens
            }else{
                break;
            }
        }
        mediaF = alturaF/contF;
        mediaM = alturaM/ contM;
        JOptionPane.showMessageDialog(null, "Média de altura");
        JOptionPane.showMessageDialog(null, "Grupo FEMININO: " + mediaF + "\nGrupo MASCULINO: " + mediaM);
    }
}
