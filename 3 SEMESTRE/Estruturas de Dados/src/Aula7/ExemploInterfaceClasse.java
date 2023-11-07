package Aula7;

public class ExemploInterfaceClasse {
    public static void main(String[] args) {
        new ExemploInterfaceClasse();
    }   
    public ExemploInterfaceClasse() { //m�todo construtor
        MinhaClasse obj = new MinhaClasse();
        obj.umMetodo();
        System.out.println(obj.umaFuncao(2, 3));
    }
}

interface MinhaInterface {
    public void umMetodo(); //apenas a declara��o, o cabe�alho do m�todo
    public String umaFuncao(float c, float d); //apenas a declara��o, o cabe�alho da fun��o
}

class MinhaClasse implements MinhaInterface {
    public void umMetodo(){
        System.out.println("Esta soma vale " + (9.0+3.0));
    }
    public String umaFuncao(float c, float d) {
        return "Esta outra soma vale " + (c+d);
    }
}
