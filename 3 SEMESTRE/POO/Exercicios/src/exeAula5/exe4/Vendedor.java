/*
 * ALUNA: Raquel Alves Fontes
 * RGM: 30109884
*/

package exeAula5.exe4;

public class Vendedor {
    float vendas, salario;
    String nome;
    int falta;

    public Vendedor(float vendas, float salario, String nome, int falta){
        this.setNome(nome);
        this.setSalario(salario);
        this.setVendas(vendas);
        this.setFalta(falta);
    }

    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Total de Vendas: " + getVendas());
        System.out.printf("Salário: %.2f" , getSalario());
        System.out.println("\nFaltas: " + getFalta());
        System.out.println("--------------------------");
    }

    public void calculaSalario() {
        setSalario(getSalario()+calculaComissao()+descontoFalta());
        //valor do sal + valorComissao + descontoFalta
        //todos sendo retornados por seus respectivos metodos
        System.out.printf("Salário final: %.2f", getSalario());
        System.out.println("\n--------------------------");
    }

    public float descontoFalta() {
        float desconto = (getSalario()/30)*getFalta();
        return desconto;
    }

    public float calculaComissao() {
        float comissao = 0;
        if (getVendas() >= 1000 && getVendas() < 2000) { //10%
            comissao = (getVendas()/100)*10;
        } else if(getVendas() >= 2000) { //15%
            comissao = (getVendas()/100)*15;
        }
        return comissao;
    }


    public int getFalta() {
        return falta;
    }

    public String getNome() {
        return nome;
    }
    public float getSalario() {
        return salario;
    }
 
    public float getVendas() {
        return vendas;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
}
