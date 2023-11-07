/*
 * ALUNA: Raquel Alves Fontes
 * RGM: 30109884
*/

package exeAula5.exe1;

public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;

    public Funcionario(){
        cargo = "Assistente";
    }
    
    public Funcionario(int cracha, float salario, String cargo) {
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void exibeFuncionario() {
        System.out.println("Crachá: " + this.cracha);
        System.out.println("Salário: " + this.salario);
        System.out.println("Cargo: " + this.cargo);
    }

    //Método para calcular de acordo com a porcentagem
    public void calculaAumento(float porcentagem) {
        float aumento = porcentagem*(this.salario/100);// se porcentagem == 20, salario = salario+(15/100 : 0.20)
        this.salario += aumento;//aplicando aumento
        System.out.println("Salário com aumento por porcentagem: " + this.salario);
    }

    //Método para somar R$150,00 ao salario p/ ano trabalhado  
    public void calculaAumento(int tempo) {
        float aumento = 150*tempo; //se tempo == 5 anos, salario += 150*5
        this.salario += aumento;//aplicando aumento
        System.out.println("Salário com aumento por tempo trabalhado: " + this.salario);
    }
    
}
