import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        float [][] nota = new float[10][3];
        float [] media = new float [10];

        int i, j, qtde=0;
        for(i=0; i<10; i++){
            float soma = 0;
            for(j=0; j<3; j++){
                nota[i][j] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a "+(j+1)+"nota do "+(i+1)+"º aluno"));
                soma += nota [i][j];
            }
            media[i] = soma/3;
            if(media[i]>6)
                qtde++;

            for(i=0; i<10; i++){
                System.out.print((i+1)+"\t");
            }
            System.out.println(media[i]+"\n");
        }
        System.out.println("A quantidade de alunos aprovados é: " + qtde);
    }
}
