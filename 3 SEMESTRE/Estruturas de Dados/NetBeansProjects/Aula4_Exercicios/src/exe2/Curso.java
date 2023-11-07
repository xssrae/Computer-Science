/*
 * Aluna: RAQUEL ALVES FONTES
 * RGM: 30109884
*/

package exeAula4.exe2;

public class Curso {
    String nomeCurso;
    int qtdeAlunos;
    String turma;
    float mensalidade;

    public Curso() {
    }

    public Curso(String n, int q, String t, float m) {
        this.nomeCurso = n;
        this.qtdeAlunos = q;
        this.turma = t;
        this.mensalidade = m;
    }

    public void cadastraCurso() {
        System.out.println("Curso cadastrado com sucesso.");
    }

    public void imprimeDados() {
        System.out.println("--------------------------");
        this.cadastraCurso();
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Turma: " + turma);
        System.out.println("Mensalidade: " + mensalidade);
        System.out.println("Qtde de alunos: " + qtdeAlunos);
    }
}
