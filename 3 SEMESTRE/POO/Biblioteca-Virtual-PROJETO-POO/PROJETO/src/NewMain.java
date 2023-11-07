/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;
import java.util.Scanner;

/**
 *
 * @author raquel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro[] livros;
        Livro livro=new Livro();
        livros = livro.carregaLivros("livros.txt");
        
        Leitor[] leitores;
        Leitor leitor=new Leitor(); 
        leitores = leitor.carregaLeitores("leitores.txt");
        
        Emprestimo[] emprestimos;
        Emprestimo emprestimo=new Emprestimo(); 
        emprestimos = emprestimo.carregaEmprestimos("emprestimos.txt");

        Fila[] filas;
        Fila fila=new Fila(); 
        filas = fila.carregaFila("fila.txt");
        
        Operacoes operacoes;
        operacoes = new Operacoes();
        
        Scanner teclado;
        teclado = new Scanner(System.in);
       
        String opcao="";

        for(;;){
            
            System.out.println("Escolha uma opção ");
            System.out.println("1 - Listar livros ");
            System.out.println("2 - Buscar livros ");
            
            System.out.println("3 - Realizar empréstimo");
            System.out.println("0 - Sair");
            opcao = teclado.nextLine();

            switch(opcao){
                case "1": 
                    livro.listaLivros(livros);
                    break;
                case "2":
                    operacoes.buscarLivros(livros);
                    //livro.buscar(livros); 
                    break; 
                case "3":
                    emprestimo.realizarEmprestimo(emprestimos,livros,leitores,filas); 
                    emprestimos=emprestimo.carregaEmprestimos("emprestimos.txt");
                    filas=fila.carregaFila("fila.txt");
                    

                    //teclado = new Scanner(System.in);
                    break;      
                case "0":
                    System.out.println("FIM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha outra opção");    
            }
        }    
    }
}