/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author raquel
 */
public class Emprestimo {
    
    private int id;
    private String nomeLeitor, senhaLeitor;
    private ArrayList<Leitor> leitoresList = new ArrayList<>();
    private int idLivro;
    private int status;//1=emprestado 0=devolvido

    public Emprestimo() {
        this.id = 0;
        this.nomeLeitor = "";
        this.senhaLeitor = "";
        this.idLivro = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }
    
    public void setSenhaLeitor(String senhaLeitor) {
        this.senhaLeitor = senhaLeitor;
    }
    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public String getSenhaLeitor() {
        return senhaLeitor;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    public int lista(Emprestimo[] emps){
        int total=0;
        System.out.println("Listando os Empréstimos");
        for (Emprestimo emprestimo : emps) {
            total++;
            if(emprestimo.getStatus()==1){
                System.out.print("___Emprestimo Realizado___");
                System.out.println("Id......:"+emprestimo.getId());
                System.out.println("Leitor..."+emprestimo.getNomeLeitor());
                System.out.println("Livro...:"+emprestimo.getIdLivro());
                System.out.println("----------------");
            } 
        }
        return total;
    }
    
    public Emprestimo buscarLivroEmprestado(Emprestimo[] emps, int idLivro){
        Emprestimo emprestimo=new Emprestimo();
        for (Emprestimo e : emps) {
            if(e.getStatus()==1){
                if(e.getIdLivro()==idLivro){
                    emprestimo.setId(e.getId());
                    emprestimo.setIdLivro(e.getIdLivro());
                    emprestimo.setNomeLeitor(e.getNomeLeitor());
                }
            }
        }
        return emprestimo;
    }
    
    public Emprestimo[] adicionaEmprestimo(Emprestimo[] emps, Emprestimo emp){
        Emprestimo[] emprestimos = new Emprestimo[emps.length+1];
        for (int i = 0; i < emps.length; i++) {
            emprestimos[i]=emps[i];
            System.out.println("ee "+emprestimos[i].getId());
        }
        emprestimos[emps.length]=emp; 
        //gravar no arquivo
        this.gravaEmprestimos("emprestimos.txt", emp);//vamos ter tudo no arquivo
        return emprestimos;//temos tudo no novo array
    }
    
    public void gravaEmprestimos(String filename,Emprestimo emprestimo){
        try {
            File file = new File(filename);
            FileWriter fw = new FileWriter(file,true);
            id=emprestimo.getId();
            nomeLeitor=emprestimo.getNomeLeitor();
            senhaLeitor=emprestimo.getSenhaLeitor();
            idLivro=emprestimo.getIdLivro();
            status=emprestimo.getStatus();    
            fw.write("\n"+id+";"+nomeLeitor+";"+idLivro+";"+status);
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void atualizaEmprestimos(String filename,Emprestimo[] emprestimos, Emprestimo emp){
        try {
            File file = new File(filename);
            FileWriter fw = new FileWriter(file);
            fw.write("id;idLeitor;idLivro;status");
            for (int i = 0; i < emprestimos.length; i++) {
                id=emprestimos[i].getId();
                nomeLeitor=emprestimos[i].getNomeLeitor();
                idLivro=emprestimos[i].getIdLivro();
                if(emprestimos[i].getId()!=emp.getId()){
                    status=emprestimos[i].getStatus();
                }else{
                    status=0;
                }
                fw.write("\n"+id+";"+nomeLeitor+";"+idLivro+";"+status);
            }
            fw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    

        public Emprestimo[] carregaEmprestimos(String fileName){
        File file = new File(fileName);
        Emprestimo emprestimo;
        Emprestimo[] emprestimos;
        Operacoes operacoes = new Operacoes();
        emprestimos = new Emprestimo[operacoes.contaLinhas(file)];
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bf = new BufferedReader(isr);
            String linha;
            linha=bf.readLine();
            int linhas=0;
            while(true){
                linha=bf.readLine();
                if(linha==null)
                    break;
                String[] dados=linha.split(";");
                emprestimo=new Emprestimo();
                emprestimo.setId(Integer.parseInt(dados[0]));
                emprestimo.setNomeLeitor(dados[1]);
                emprestimo.setIdLivro(Integer.parseInt(dados[2]));
                emprestimo.setStatus(Integer.parseInt(dados[3]));
                emprestimos[linhas]=emprestimo;
                linhas++;
            }
            bf.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return emprestimos;
    }
            
    public void realizarEmprestimo(Emprestimo[] emprestimos, Livro[] livros, Leitor[] leitores,Fila[] filas){
        int idLivro = 0;
        String nomeLeitor = "", senhaLeitor = "";
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        System.out.println("Escolha a opção para finalizar emprestimo: \n1- Login \n2-Cadastrar-se");
        String opcao = "";
            switch(opcao){
                case "1": realizaCadastro(emprestimos, livros, leitores);
                break;
                case "2": realizarLogin(emprestimos, livros, leitoresList);
                break;
            }
        
        System.out.println("Digite o id do livro: ");
        idLivro = teclado.nextInt();
        System.out.println("Digite o nome do leitor: ");
        nomeLeitor = teclado.next();
        System.out.println("Digite a senha: ");
        senhaLeitor = teclado.next();
        
        
        //verificar se o livro esta disponivel
        Emprestimo empTeste;
        empTeste = new Emprestimo();
        empTeste = empTeste.buscarEmprestimoPorIdDeLivro(emprestimos, idLivro);

        if(empTeste.getNomeLeitor()!="-"){
            System.out.println("Livro emprestado");
            System.out.println("Deseja entrar na fila de espera? (s/n)");
            //caso nao estiver disponivel, ler a fila de espera 
            //adicionar na lista de espera
            teclado = new Scanner(System.in);
            String confirma;
            confirma = teclado.nextLine();
            if(confirma.equals("s")){
                Fila fi = new Fila();
                fi.setId(filas.length+1);
                fi.setNomeLeitor(nomeLeitor);
                fi.setIdLivro(idLivro);
                fi.gravaFilas("fila.txt", fi);
            }

        }else{
            //teclado.close();
            System.out.println("Confirma Empréstimo? (s/n)");
            teclado = new Scanner(System.in);
            String confirma;
            confirma = teclado.nextLine();
            if(confirma.equals("s")){
                //adicionar na lista de emprestimos
                System.out.println("Empréstimo confirmado");
                Emprestimo emp = new Emprestimo();
                emp.setId(emprestimos.length+1);
                emp.setNomeLeitor(nomeLeitor);
                emp.setIdLivro(idLivro);
                emp.setStatus(1);
                //adicionaEmprestimo(emprestimos,emp);
                gravaEmprestimos("emprestimos.txt", emp);//vamos ter tudo no arquivo
            }
            //teclado.close();
        }
    }
        public Emprestimo buscarEmprestimoPorIdDeLivro(Emprestimo[] emprestimos,int idBuscar){
        Emprestimo emp = new Emprestimo();
        for (Emprestimo emprestimo : emprestimos) {    
            if(emprestimo.getStatus()==1){//apenas os emprestados serão considerados
                if(emprestimo.getIdLivro()==idBuscar){ //aqui é idLivro pois vamos verificar se o livro se encontra emprestado
                    id = emprestimo.getId();
                    nomeLeitor = emprestimo.getNomeLeitor();
                    idLivro = emprestimo.getIdLivro();
                    status = emprestimo.getStatus();
                    emp.setId(id);
                    emp.setNomeLeitor(nomeLeitor);
                    emp.setIdLivro(idLivro);
                    emp.setStatus(status);
                    break;
                }
            }    
        }
        return emp;
    }
    
    Fila[] filas;
    
    
    public void realizaCadastro(Emprestimo[] emprestimos, Livro[] livros, Leitor[] leitores){
        //verificar se o leitor realmente existe
        Leitor leitor = new Leitor();
        
        leitor.setId(idLivro);
        leitor.setNome(nomeLeitor);
        leitor.setSenha(senhaLeitor);
        System.out.println("Usuário cadastrado com sucesso.");
    }
    

    public void realizarLogin(Emprestimo[] emprestimos, Livro[] livros, ArrayList<Leitor> leitores){
        //verificar se o livro realmente existe
       
        Livro livro = new Livro();
        livro = livro.buscarPorId(livros, idLivro);
    
        String leitor = "";
        for(Leitor leitorAtual : leitores) {
            if(livro.getId()==0){
                System.out.println("Livro não existente");
                return;
            }
            if(!leitorAtual.getNome().equals(nomeLeitor)){
                System.out.println("Leitor não existente");
                return;
            }
            if(!leitorAtual.getSenha().equals(senhaLeitor)){
                System.out.println("Senha do usuário incorreta.");
                return;
            }
        }
    }
    
}
