package Aula1;

public class ContaCorrente {
    String nome;
    float saldo;
    float limite;
    char tipo;
    
    ContaCorrente(String n, float s, float l, char t) { //Criando um contrutor
        nome = n;
        saldo = s;
        limite = l;
        tipo = t;
    }
    
    ContaCorrente(String n, float s, char t) { /* Pode existir um segundo com o mesmo nome, porém,
                                                  os atributos precisam ser diferentes */
        nome = n;
        saldo = s;
        tipo = t;
    }
}
