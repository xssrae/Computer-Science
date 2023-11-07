public class Exe1 {
    public static void main(String[] args) {
        // indice = 0 a 11
        // qtde itens = 12
        int i = 0;
        int indice = 0, aux = 0, superacao, mediaSuperada = 0, acum = 0;
        double mediaVendas = 0;
        int [] qtdeVendas = {10, 15, 8, 13, 7, 2, 23, 4, 17, 7, 9, 20};
        String [] meses = {" Jan ", " Fev ", " Mar ", " Abr ",  " Mai ", " Jun ", " Jul ", " Ago ", " Set ", " Out ", " Nov ", " Dez "};
        String menores = "";
        String maiores = "";

        for (i = 0; i < 12; i++){ // enquanto i for < que o tamanho da lista, i vai iterar;

            //MESES COM MAIORES VENDAS
            if (qtdeVendas[i] > aux){
                aux = qtdeVendas[i]; // pegando o valor Maior para ser comparado com a prox iteração
                indice = i; //pegando o indice para saber o mês correspondente
                maiores += meses[indice]; //passando o indice para 'mes' e pegando o mes correspondente
            }else{
                aux = qtdeVendas[i];
                indice = i;
                menores += meses[i];
            }

            acum += qtdeVendas[i];  //acumulando total de vendas
            mediaVendas = acum/12; //media de vendas por mês
            superacao = qtdeVendas[i]; //referencia para verificar quais meses superam as vendas 

            if(superacao > mediaVendas){
                mediaSuperada++; //somando meses que superaram a media
            }
        }
        System.out.println("Meses com MAIORES vendas: " + maiores);
        System.out.println("Meses com MENORES vendas: " + menores );
        System.out.printf("Média de vendas em todos os meses: %.2f", mediaVendas);
        System.out.println("\nQtde de meses que superaram a média: " + mediaSuperada);
    }
}