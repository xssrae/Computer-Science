/*
 * ALUNA: Raquel Alves Fontes
 * RGM: 30109884
*/

package exeAula5.exe3;
public class Torneio {
    private String nome;
    private int idade;

    public Torneio(){}

    public Torneio(String nome, int idade){
        this.setNome(nome);
        this.setIdade(idade);
    }

    public String verificaCategoria() {
        String categoria = "";
        if (getIdade() >= 5 && getIdade() <=7) {
            categoria = "Infantil";
        } else if (getIdade() >= 8 && getIdade() <= 10){
            categoria = "Juvenil";
        } else if (getIdade() >= 11 && getIdade() <= 15) {
            categoria = "Adolescente";
        } else if (getIdade() >= 16 && getIdade() <= 30) {
            categoria = "Adulto";
        } else if (getIdade() > 30) {
            categoria = "Senior";
        }

        return categoria;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Categoria: " + verificaCategoria());
    }
}
