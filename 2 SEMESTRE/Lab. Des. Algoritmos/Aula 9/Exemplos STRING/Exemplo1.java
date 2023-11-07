public class Exemplo1{
    public static void main(String[] args) {
        String nome1 = "Mark Zuckerberg";
        String teste [];

        String nome = "Carl Jung";

        if(nome.equals("Carl Jung")){
            System.out.println("Você acertou");
        }

        String frase = "Rae raquel quelzinha";
        System.out.println(frase.substring(10));

        teste = frase.split(" ");
        for(int i=0; i<teste.length; i++){
            System.out.println(teste[i]);
        }
    }
}