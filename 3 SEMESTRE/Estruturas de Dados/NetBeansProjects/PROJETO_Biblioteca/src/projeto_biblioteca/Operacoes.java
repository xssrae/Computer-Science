/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_biblioteca;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Operacoes {
    
    Livro livro;    
    
    public int contaLinhas(File file){
        System.out.println("Contando as linhas");
        int total=0;
        try {
            FileReader isr = new FileReader(file);
            BufferedReader bf = new BufferedReader(isr);
            String linha;
            linha=bf.readLine();
            int linhas=0;
            while(true){
                linha=bf.readLine();
                if(linha==null)
                    break;
                linhas++;
            }
            total=linhas;
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("t"+total);
        return total;
    }
    
    public void buscarLivros(Livro[] livros){
        livro = new Livro();
        String nome;
        Scanner teclado = new Scanner(System.in);
        Systemhttps://open.spotify.com/track/7cMFjxhbXBpOlais7KMF3j?si=8c79267065c540bd.out.println("Digite o termo (Autor ou título) desejado");
        nome = teclado.nextLine();
        
        livro.buscar(livros, nome);
        
        for (Livro livro : livros) {
            //realizando uma busca pelo que foi digitado pelo usuário
            if(livro.getTitulo().toLowerCase().contains(nome.toLowerCase())){
                System.out.println("Id......:"+livro.getId());
                System.out.println("Título..:"+livro.getTitulo());
                System.out.println("Autor...:"+livro.getAutor());
                System.out.println("----------------");
            }
           //buscando pelo nome de autor que foi digitado pelo usuário
            if(livro.getAutor().toLowerCase().contains(nome.toLowerCase())){
                System.out.println("Id......:"+livro.getId());
                System.out.println("Título..:"+livro.getTitulo());
                System.out.println("Autor...:"+livro.getAutor());
                System.out.println("----------------");
            }
            
        }
    }
    
}