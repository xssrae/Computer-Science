package Aula5;
class Trabalhador {

   private String nome;
   private float salario;
   private char sexo;


   public static void main(String[] args) {

      Trabalhador[] trab = new Trabalhador[7];
      trab[0] = new Trabalhador("Julio",  2000f, 'M');
      trab[1] = new Trabalhador("Mariana",  1000, 'F');
      trab[2] = new Trabalhador("Renata",  800, 'F');
      trab[3] = new Trabalhador("Pedro",  1500f, 'M');
      trab[4] = new Trabalhador("Amilton",  6000f, 'M');
      trab[5] = new Trabalhador("Jorge",  2200f, 'M');
      trab[6] = new Trabalhador("Carlos",  3500f, 'M');

  }


   public Trabalhador(){
      nome = "-";
      salario = 0;
      sexo = '-';
   }

   public Trabalhador(String inNome, float inSalario,
   	                  char inSexo) {
      setNome(inNome);
      setSalario(inSalario);
      setSexo(inSexo);
   }

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
       return(getNome() + ", salário mensal: R$" + getSalario()
       	    + ", salário anual: R$" + salarioAnual()
            + ", sexo: " + getSexo());
       //ou:  return(nome + ", salário mensal:" + salario + ", salário anual:" + salarioAnual() + ", sexo:" + sexo);
   }

   public float salarioAnual()  {
   	  return(salario * 13 + salario/3);
   }

} //fim da classe Trabalhador

