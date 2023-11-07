package Filas.Exe1;
import java.util.Scanner;

public class ImprimirDoc {  
    public static void main(String[] args) {
        Scanner lendo = new Scanner(System.in);
        Fila1 filaImpressao = new Fila1();
        String nome;
        int qtde;
        for(int i=0; i < filaImpressao.getMAX(); i++){
            System.out.println("Iniciando Impressora.");
            System.out.print("Digite o ducumento que deseja imprimir: ");
            nome= lendo.nextLine();
            System.out.print("Digite a qtde de páginas para imprimir: ");
            qtde= lendo.nextInt();
            Docs documento = new Docs(nome, qtde);

            System.out.print("Adicionando documento " +documento.toString()+ "a fila de impressão");
            filaImpressao.enqueue(documento);
        }

        for(int i=0; i<filaImpressao.getMAX(); i++){
            System.out.println("Documentos na fila: " + filaImpressao.toString());
            System.out.println("Imprimindo documento: " + filaImpressao.peek());
            filaImpressao.dequeue();
        }
        System.out.println("Fila de impressão vazia. " + filaImpressao.toString());
        
    }
}
