/*
 * Nome: Raquel Alves Fontes
 * RGM: 30109884
*/

package Exercicios.A5;

public class Empresa {

    // Ordenação dos Salários - Decrescente
    public static boolean quickSortSalario(Trabalhador[] vetor, int inicio, int fim) {
        if (vetor == null)
            return false;
        if (inicio < fim) {
            int posicaoPivot = separarSalario(vetor, inicio, fim);
            quickSortSalario(vetor, inicio, posicaoPivot - 1);
            quickSortSalario(vetor, posicaoPivot + 1, fim);
        }
        return true;
    }

    public static int separarSalario(Trabalhador[] vetor, int inicio, int fim) {
        float pivot = vetor[inicio].getSalario();
        int i = inicio + 1, f = fim;

        while (i <= f) {
            if (vetor[i].getSalario() > pivot)
                i++;
            else if (vetor[f].getSalario() <= pivot)
                f--;
            else {
                trocar(vetor, i, f);
                i++;
                f--;
            }
        }
        trocar(vetor, inicio, f);
        return f;
    }

    public static void trocar(Trabalhador[] vetor, int i, int f) {
        Trabalhador troca = vetor[i];
        vetor[i] = vetor[f];
        vetor[f] = troca;
    }

    // Ordenação dos nomes - Alfabeticamente
    public static boolean quickSortNome(Trabalhador[] vetor, int inicio, int fim) {
        if (vetor == null)
            return false;

        if (inicio < fim) {
            int posicaoPivo = separarNome(vetor, inicio, fim);
            quickSortNome(vetor, inicio, posicaoPivo - 1);
            quickSortNome(vetor, posicaoPivo + 1, fim);
        }
        return true;

    }

    public static int separarNome(Trabalhador[] vetor, int inicio, int fim) {
        Trabalhador pivot = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i].getNome().compareToIgnoreCase(pivot.getNome()) <= 0)
                i++; // se vetor[i] for menor alfabeticamente q pivo
            else if (pivot.getNome().compareToIgnoreCase(vetor[f].getNome()) < 0)
                f--;// se pivo for menor alfabeticamente q vetor[f]
            else {
                Trabalhador troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivot;
        return f;
    }
}
