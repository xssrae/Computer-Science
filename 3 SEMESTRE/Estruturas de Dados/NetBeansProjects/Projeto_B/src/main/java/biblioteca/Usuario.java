/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

public class Usuario {
    private String nome, email, senha;

    public Usuario(String n, String r, String s){
        this.nome = n;
        this.email = r;
        this.senha = s;
    }

    public void exibirUsuário() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + getEmail());
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    public void setEmail(String r) {
        this.email = r;
    }
    public void setSenha(String s) {
        this.senha = s;
    }  
}
