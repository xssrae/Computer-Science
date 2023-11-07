/*
 * Aluna: RAQUEL ALVES FONTES
 * RGM: 30109884
*/

package exeAula4.exe3;

public class Paciente {
    String nome, rg, endereco, telefone, proficao;
    int anoNascimento;

    public Paciente(String n, String r, String e, String t, String p, int a) {
        this.nome = n;
        this.rg = r;
        this.endereco = e;
        this.telefone = t;
        this.proficao = p;
        this.anoNascimento = a;
    }

    public void cadastraDados() {
        System.out.println("Dados cadastrados com sucesso.");
    }

    public void imprimeDados() {
        System.out.println("--------------------------");
        this.cadastraDados();
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Profissao: " + proficao);
    }

}
