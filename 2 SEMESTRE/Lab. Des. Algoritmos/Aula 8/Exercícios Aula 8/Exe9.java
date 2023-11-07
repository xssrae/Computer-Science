import javax.swing.JOptionPane;
public class Exe9 {
    public static void main(String[] args) {
        int idades = 0, contador = 0, acum = 0, masc = 0, fem = 0;
        double mediaIdade, mediaSalario, salario;
        char genero;

        while(true){
            genero = JOptionPane.showInputDialog(null,"Informe o gênero: \n(F - Feminino M - Masculino)").charAt(0);
            idades = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade: "));
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salário: "));
            if(idades<0){
                break;
            }else{
                idades += idades; //idades de todos do grupo
                contador ++;

                if(genero == 'F' && salario < 600){ //qtde de mulhers q recebem < 600
                    fem += 1; 

                }else{ //acumulo do salarios dos homens
                    masc += 1;
                    acum += salario;
                }
            } 
        }
        mediaIdade = idades/contador; // media de idade do grupo
        mediaSalario = acum/masc; //media salarial dos homens

        JOptionPane.showMessageDialog(null, "Média de idade do grupo:" + mediaIdade);
        JOptionPane.showMessageDialog(null, "Qtde de mulheres que recebem menos que R$600,00: " + fem);
        JOptionPane.showMessageDialog(null, String.format("Média salarial dos homens: %.2f", mediaSalario));
    }
}