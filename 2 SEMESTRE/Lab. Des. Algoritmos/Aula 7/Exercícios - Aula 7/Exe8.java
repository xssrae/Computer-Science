import javax.swing.JOptionPane;
public class Exe8{
    public static void main(String[] args) {
        int destino = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o destino: \n1) Norte \n2) Nordeste \n3) Centro-Oeste \n4) Sul"));
        String passagem = JOptionPane.showInputDialog(null, "A viagem inclui ida e volta?").toUpperCase();
        int ida = 0, idaVolta = 0;

        if(passagem == "NÃO" || passagem == "não"){
            switch(destino){
                case 1: ida = 500;
                break;
                case 2: ida = 350;
                break;
                case 3: ida = 350;
                break;
                case 4: ida = 600;
                break;
            }
            JOptionPane.showMessageDialog(null, "Preço da passaagem: R$" + ida + ",00");
        }else{
            switch(destino){
                case 1: idaVolta = 900;
                break;
                case 2: idaVolta = 650;
                break;
                case 3: idaVolta = 600;
                break;
                case 4: idaVolta = 550;
                break;
            }
            JOptionPane.showMessageDialog(null, "Preço da passaagem: R$" + idaVolta + ",00");
        }
    }
}
 