/*
 * Aluna: RAQUEL ALVES FONTES
 * RGM: 30109884
*/

package exeAula4.exe1;

public class Data {
    int dia, mes, ano;

    public Data() {
    }

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void imprimeData() {
        System.out.println("-------------------------------------");
        System.out.print(dia + "/");
        System.out.print(mes + "/");
        System.out.println(ano);
        
    }
}
