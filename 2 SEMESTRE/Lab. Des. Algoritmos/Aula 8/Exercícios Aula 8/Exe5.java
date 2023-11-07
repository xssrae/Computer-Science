import java.util.Scanner;
public class Exe5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i;
        double valores, media, maiorNum=1, acum=0, cont=0; 

        System.out.println("Digite os valores: \n(Número negativo para parar)");
        while(true){
            valores = leia.nextInt();
            if(valores < 0){   //parando o loop
                break;
            }
            acum+=valores; //acumulando valores
            cont++; //contando as entradas

            for(i=0; i<=valores; i++){  //verificando o maior número digitado
                if(valores > maiorNum){
                    maiorNum = i;
                }
            }
        }
        media = acum/cont;  //media dos valores digitados
        System.out.println("Média dos valores digitados: " + media);
        System.out.println("Maior valor digitado: " + maiorNum);
    }
}
