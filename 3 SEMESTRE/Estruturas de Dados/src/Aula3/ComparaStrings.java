package Aula3;

public class ComparaStrings {

    public static void main(String[] args) {
        /*
            A compara��o de strings em Java n�o pode ser efetuada com ==, devem 
            ser utilizadas fun��es de compara��o como: equals, equalsIgnoreCase, 
            compareTo e compareToIgnoreCase.
        */
        String stra, strb, strc, strd;
        
        //Para comparar se duas strings s�o iguais.
        //Com ignore case tanto faz se as letras est�o em min�sculas ou mai�sculas.
        stra = "S�o Paulo, Brasil";
        strb = "S�O PAULO, BRASIL";
        System.out.println("Verificando se '" + stra + "' � igual a '" + strb + "' : " + stra.equals(strb) );
        System.out.println("Verificando se '" + stra + "' � igual a '" + strb + "' : " + stra.equalsIgnoreCase(strb) );
       
       //Com compareTo e compareToIgnoreCase podemos saber se uma string � menor, igual ou maior que outra.
       //A compara��o n�o � por tamanho (para isso usar length) e sim alfab�tica.
        stra = "A vida � bela, � bom aproveitar cada momento";
        strb = "Praia � tudo de bom";    
        System.out.println("Verificando se '" + stra + "' � maior que '" + strb + "' : " + (stra.compareTo(strb)>0)  );
        System.out.println("Verificando se '" + strb + "' � maior que '" + stra + "' : " + (strb.compareTo(stra)>0)  );
    }
    
}
