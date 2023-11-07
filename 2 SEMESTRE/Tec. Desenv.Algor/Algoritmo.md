#Algoritmo principal#

1- Algoritmo: Verificação de pares;

(Início)
    Inteiro num;
    Escreva("Digite um número: ");
    Leia(num);

    Se (num % 2 == 0){
        Escreva("Número" + num "é par")
    }
    Senão{
        Escreva("Número" + num "é impar")
    }
(Fim)

2- Algoritmo: Multiplos de 7;

(Início)
    Inteiro num;

        Escreva("Digite um número: ");
        Leia(num);

        Se (num % 7 == 0){
            Escreva("Número" + num "é multiplo de 7");
        }
        Senão{
            Escreva("Número" + num "não é multiplo de 7");
        }

3- Algoritmo: Menor número;

(Início)
    Inteiro a, b, c;

    Escreva("Digite A")
    Leia(a)
    Escreva("Digite B")
    Leia(b)
    Escreva("Digite C")
    Leia(c)

    1 caso (a < b && a < c){
        Escreva( a + "é o menor número");
    }
    2 caso (b < c && b < a ){
        Escreva( b + "é o menor número");
    }
    3 caso(c < a && c < b){
        Escreva(c + "é o menor número");
    }
(Fim)









