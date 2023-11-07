package projeto_biblioteca;

public class Usuario {
    private String nome, RGM, senha;

    public Usuario(String n, String r, String s){
        this.nome = n;
        this.RGM = r;
        this.senha = s;
    }

    public void exibirUsuário() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("RGM: " + getRGM());
    }

    public String getNome() {
        return nome;
    }
    public String getRGM() {
        return RGM;
    }
    public String getSenha() {
        return senha;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    public void setRGM(String r) {
        this.RGM = r;
    }
    public void setSenha(String s) {
        this.senha = s;
    }
    
}