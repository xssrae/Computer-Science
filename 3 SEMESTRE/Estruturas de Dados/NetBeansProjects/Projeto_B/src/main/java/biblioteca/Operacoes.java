package biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author marce
 */
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
}