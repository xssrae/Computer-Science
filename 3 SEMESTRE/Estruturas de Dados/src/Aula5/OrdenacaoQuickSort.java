package Aula5;

public class OrdenacaoQuickSort {

    public static void main(String[] args) {
        new OrdenacaoQuickSort();
    }
    
    public OrdenacaoQuickSort() {
        double vetnulo[] = null;        
        if (!quickSort(vetnulo, 0, 4)) {
           System.out.println("O vetnulo (vetor nulo) n�o pode ser ordenado em quickSort...\n"); 
        }
        
        double vet[] = {8, 5, 3, 9, 2, 6, 4, 1, 7};
        
        System.out.println("Vetor desordenado:");
        visualizar(vet);
        
        quickSort(vet, 0, vet.length-1); 
        
        System.out.println("Vetor ordenado:");
        visualizar(vet);
    }
    
    public boolean quickSort(double[] vetor, int inicio, int fim) {
        if (vetor == null) return false;   
        if (inicio < fim) {
           int posicaoPivo = separar(vetor, inicio, fim);
           //tire o comentário da seguinte linha se quiser ver passo a passo:
           System.out.println("Separaçao - posiçaoPivo " + posicaoPivo + ":"); visualizar(vetor);
           quickSort(vetor, inicio, posicaoPivo - 1);
           quickSort(vetor, posicaoPivo + 1, fim);
        }        
        return true;
    }
    
   private int separar(double[] vetor, int inicio, int fim) {
      double pivo = vetor[inicio];
      int i = inicio + 1, f = fim; // começamos em inicio+1 porque o pivot é vetor[inicio]
      while (i <= f) {
         if (vetor[i] <= pivo)//menores que pivot
            i++;
         else if (pivo < vetor[f])//maiores que pivot
            f--;
         else {  //troca vetor[i] com vetor[f]
            double troca = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = troca;
            i++;
            f--;
         }
      }
      vetor[inicio] = vetor[f]; //troca de pivot para local definitivo
      vetor[f] = pivo;
      return f;
   }    
    
    public void visualizar(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "   ");
        }
        System.out.println("\n");
    }

}

