package Aula3_Exercicios;

public class Data {
    int dia, mes, ano;

    public Data() {}

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    
    public void imprimeDados() {
        System.out.println("-------------------------------------");
        System.out.println("Ano: " + ano);
        System.out.println("Mes: " + mes);
        System.out.println("Dia: " + dia);
    }
}