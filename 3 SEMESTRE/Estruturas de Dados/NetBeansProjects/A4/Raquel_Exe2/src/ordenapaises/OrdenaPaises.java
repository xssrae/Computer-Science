/*
Aluna: Raquel Alves Fontes
RGM: 30109884
*/

package ordenapaises;

public class OrdenaPaises {

    public static void main(String[] args) {
        new OrdenaPaises();
    }

    public OrdenaPaises() {
        String[] paises = { "França", "Brasil", "Russia", "Dinamarca", "Alemanha", "Inglaterra", "Canadá" };

        System.out.println("Array Original: ");
        exibePaises(paises);

        ordenaPaises(paises);
        System.out.println();
        System.out.println("Array Ordenado: ");
        exibePaises(paises);
    }

    public static void ordenaPaises(String[] pais) {
        int n = pais.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pais[j].compareTo(pais[j + 1]) > 0) {
                    String temp = pais[j];
                    pais[j] = pais[j + 1];
                    pais[j + 1] = temp;
                }
            }
        }
    }

    public static void exibePaises(String[] pais) {
        for (int i = 0; i < pais.length; i++) {
            System.out.print(pais[i] + ", ");
        }
        System.out.println();
    }
}
