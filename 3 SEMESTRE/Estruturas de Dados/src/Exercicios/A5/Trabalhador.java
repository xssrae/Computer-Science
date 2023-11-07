/*
 * Nome: Raquel Alves Fontes
 * RGM: 30109884
*/

package Exercicios.A5;
import javax.swing.*;

class Trabalhador { //Decidi implementar a classe main na dentro de Trabalhador pois prefiri inserir todos os métodos de visualização separados dos de ordenação.

   private String nome;
   private float salario;
   private char sexo;

   public Trabalhador(){
      nome = "-";
      salario = 0;
      sexo = '-';
   }

   public Trabalhador(String inNome, float inSalario, char inSexo) {
      setNome(inNome);
      setSalario(inSalario);
      setSexo(inSexo);
   }

   public static void main(String[] args) {
      Trabalhador[] trab = new Trabalhador[7];
      trab[0] = new Trabalhador("Julio", 1500f , 'M');
      trab[1] = new Trabalhador("Mariana",1000, 'F');
      trab[2] = new Trabalhador("Renata",3500f, 'F');
      trab[3] = new Trabalhador("Pedro", 6000f , 'M');
      trab[4] = new Trabalhador("Amilton",2000f, 'M');
      trab[5] = new Trabalhador("Jorge",2200f, 'M');
      trab[6] = new Trabalhador("Carlos",800 , 'M');


      Empresa.quickSortNome(trab, 0, trab.length-1);
      mostraTrabalhadoresNome(trab);
      Empresa.quickSortSalario(trab, 0, trab.length-1);
      mostraTrabalhadoresSalario(trab);
  }

  public static void mostraTrabalhadoresNome(Trabalhador[]vetor) {
      String cad = "";
      cad += "Ordem Alfabética: \n";
      for (int i=0; i<vetor.length; i++) {
         cad +=  vetor[i].toString()+ "\n";
      }
         JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
         outputArea.setText(cad);
         JScrollPane rolagem = new JScrollPane(outputArea);
         JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores cadastrados: ",
                       JOptionPane.INFORMATION_MESSAGE);
   }

   public static void mostraTrabalhadoresSalario(Trabalhador[]vetor) {
      String cad = "";
      cad += "Salário Decrescente: \n";
      for (int i=0; i<vetor.length; i++) {
         cad +=  vetor[i].toString()+ "\n";
      }
         JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
         outputArea.setText(cad);
         JScrollPane rolagem = new JScrollPane(outputArea);
         JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores cadastrados: ",
                       JOptionPane.INFORMATION_MESSAGE);
   }

//------------------------------------------------------------------------

   public void setNome(String inNome) {
      nome = inNome;
   }

   public void setSalario(float inSalario) {
      if (inSalario>0) salario = inSalario; else salario=0;
   }

   public void setSexo(char inSexo) {
      sexo = '-';
      if(inSexo=='F' || inSexo=='M') sexo = inSexo;
   }

  public String getNome() {
  	return nome;  //ou this.nome
  }

  public float getSalario() {
  	return salario;  //ou this.salario
  }

  public String getSalarioStr() {
  	return "R$" + salario;
  }

  public char getSexo() {
  	return sexo;
  }

   public String toString()  {
       return(nome + " - salário mensal: " + salario + ", salário anual:  " + salarioAnual() + ", sexo:  " + sexo);
   }

   public float salarioAnual()  {
   	  return(salario * 13 + salario/3);
   }
}

