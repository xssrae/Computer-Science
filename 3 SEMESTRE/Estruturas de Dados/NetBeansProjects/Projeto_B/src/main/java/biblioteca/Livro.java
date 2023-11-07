package biblioteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Livro {
    private String titulo, autor;
    private int qtde, id, anoPublicacao;

    public Livro(){
        this.id = 0;
        this.titulo = "";
        this.autor = "";
        this.anoPublicacao = 0;
    }
    
    public Livro (String n, String a, int q, int ano){
        this.setTitulo(n);
        this.setAutor(a);
        this.setQtde(q);
        this.setAnoPublicacao(ano);
    }

    public Livro buscarPorId(Livro[] livros,int idBuscar){
        Livro l = new Livro();
        for (Livro livro : livros) {
            if(livro.getId()==idBuscar){
                id = livro.getId();
                titulo = livro.getTitulo();
                autor = livro.getAutor();
                System.out.println("Id......:"+id);
                System.out.println("Título..:"+titulo);
                System.out.println("Autor...:"+autor);
                System.out.println("----------------");
                l.setId(id);
                l.setAutor(autor);
                l.setTitulo(titulo);
                break;
            }
        }
        return l;
    }

    public int listaLivros(Livro[]livros){
        int total=0;
        System.out.println("Listagem de livros:");
        for (Livro livro : livros){
            System.out.println("Id........." +livro.getId());
            System.out.println("Título........." +livro.getTitulo());
            System.out.println("Autor........." +livro.getAutor());
            System.out.println("Ano Publicação........." +livro.getAnoPublicacao());

            System.out.println("_________________________________");
            total++;

        }
        return total;
    }



    public Livro[] listaOrdenado(Livro[] livros){
        Livro livroTemp;
        String a1,a2;
        for (int i = 0; i < livros.length; i++) {
            for (int j = 0; j < livros.length-1-i; j++) {
                a1=livros[j].getTitulo().trim();
                a2=livros[j+1].getTitulo().trim();
                if(a1.charAt(0)>a2.charAt(0)){
                    livroTemp=livros[j];
                    livros[j]=livros[j+1];
                    livros[j+1]=livroTemp;
                }
            }
        }
        return livros;
    }

    public void listaOrdenadoAutor(Livro[] livros){
        Livro livroTemp;
        String a1,a2;
        for (int i = 0; i < livros.length; i++) {
            for (int j = 0; j < livros.length-1-i; j++) {
                a1=livros[j].getAutor().trim();
                a2=livros[j+1].getAutor().trim();
                if(a1.charAt(0)>a2.charAt(0)){
                    livroTemp=livros[j];
                    livros[j]=livros[j+1];
                    livros[j+1]=livroTemp;
                }
            }
        }
        int t = this.listaLivros(livros);
    }

    
//Metodos Getters e Setters________________________________________________________________________________________________
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getAutor() {
        return autor;
    } 
    public String getTitulo() {
        return titulo;
    }
    public int getQtde() {
        return qtde;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public int getId() {
        return id;
    }
}
