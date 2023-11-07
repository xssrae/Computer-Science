import java.util.Scanner;
public class Exe5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String placa1 = "", placa2 = "", resp;

        //VERIFICAR SE O CARACTERE É UM INT, CASO CONTRÁRIO NÃO RODA E VAI PRO EXCEPTION:
        try{
            System.out.println("Informe a placa do carro: ");
            placa1 = leia.next();
    
            System.out.println("Deseja verificar mais uma placa? ");
            resp = leia.next().toUpperCase();

            verificaRodizio(placa1);

            if(resp.equals("SIM")){
                System.out.println("Informe a placa do 2 carro: ");
                placa2 = leia.next();

                verificaRodizio(placa2);
            }

        }catch (IndexOutOfBoundsException erro1){
            System.out.print("Placa do carro de tamanho inválido.");
        }catch (NumberFormatException erro2){
            System.out.print("Placa do carro com digitos inválidos.");
        }
    }

    public static String verificaRodizio(String placa) {  //metodo que retorna o dia de rodizio de cada placa digitada
        String diaRodizio = "";
        char finalPlaca = '\0';

        finalPlaca += placa.charAt(6); //PEGANDO FINAL DA PLACA
        int digito = Character.getNumericValue(finalPlaca);  //PEGANDO CHAR E TRANSFORMANDO EM INT

        switch(digito){
            case 1: case 2: diaRodizio = "Segunda-feira";
            break;
            case 3: case 4: diaRodizio= "Terça-Feira";
            break;
            case 5: case 6: diaRodizio = "Quarta-Feira";
            break;
            case 7: case 8: diaRodizio= "Quinta-Feira";
            break;
            case 9: case 0: diaRodizio = "Sexta-Feira";
            break;
        }
        System.out.println("O dia do rodizio para a placa " + placa + " será: " + diaRodizio);

        return diaRodizio;
    }
}