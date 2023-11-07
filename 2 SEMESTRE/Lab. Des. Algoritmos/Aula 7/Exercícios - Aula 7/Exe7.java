import  javax.swing.JOptionPane;
public class Exe7 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade: "));
        String clasEleitoral = "";

        if(idade >= 18 && idade <= 65 ){
            clasEleitoral = "Eleitor obrigatório";
        }else if(idade>=16 && idade<=18 || idade>65){
            clasEleitoral = "Eleitor facultativo";

        }else{
            clasEleitoral = "Não eleitor";
        }
        JOptionPane.showMessageDialog(null, clasEleitoral);
    }
}