import javax.swing.JOptionPane;
public class Exe4 {
    public static void main(String[] args) {
        int NUM = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para saber o MÊS correspondente: "));
        String msg = "";

        if(NUM < 1 || NUM > 12){
            msg = "Não existe mês com esse número.";
        }else{
            switch(NUM){
                case 1: msg = "Janeiro";
                break;
                case 2: msg = "Fevereiro";
                break;
                case 3: msg = "Março";
                break;
                case 4: msg = "Abril";
                break;
                case 5: msg = "Maio";
                break;
                case 6: msg = "Junho";
                break;
                case 7: msg = "Julho";
                break;
                case 8: msg = "Agosto";
                break;
                case 9: msg = "Setembro";
                break;
                case 10: msg = "Outubro";
                break;
                case 11: msg = "Novembro";
                break;
                case 12: msg = "Dezembro";
                break;
            }
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
