package Exercicios.A6;
public class Buscas {
    
    public static void main(String[] args) {
        String paisesA [] = { "Ucrânia", "Turquia", "Suíça", "México", "França", "Espanha"};
        String paisesB [] = { "Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França", "Inglaterra", "Turquia", "Uruguai" };
        String paisesC [] = { "Canadá", "Áustria", "Chile", "Itália", "Portugal", "Grécia","Angola", "Moçambique", "Rússia" };
        
        quickSort(paisesA, 0, paisesA.length - 1);
        
        for (String pais : paisesA) {
            System.out.println(pais);
        }
    }
    
    public static void quickSort(String[] array, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particao(array, inicio, fim);
            quickSort(array, inicio, posicaoPivo - 1);
            quickSort(array, posicaoPivo + 1, fim);
        }
    }
    
    private static int particao(String[] array, int inicio, int fim) {
        String pivo = array[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (array[i].compareTo(pivo) <= 0)
                i++;
            else if (pivo.compareTo(array[f]) < 0)
                f--;
            else {
                String troca = array[i];
                array[i] = array[f];
                array[f] = troca;
                i++;
                f--;
            }
        }
        array[inicio] = array[f];
        array[f] = pivo;
        return f;
    }
}
