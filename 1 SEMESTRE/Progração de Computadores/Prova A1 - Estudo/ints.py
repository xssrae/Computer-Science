    
# Programe que lê um inteiro positivo n e imprime os n primeiros inteiros positivos.
    #Exemplo de execução:
#Digite o valor de n: 3
    #1
    #3
    #5
    #>>>

# leia o valor de n
print("Gerador do n primeiros números ímpares positivos\n")
n = int(input("Digite o valor de n: "))

# contador de ímpares impressos
i = 0

# primeiro número ímpar
ímpar = 1

# imprima os n primeiros impares, um por linha
while i < n: 
    # imprima o próximo número ímpar
    print(ímpar)

    # incremente p contador
    i = i + 1

    # determine o próximo ímpar
    ímpar = ímpar + 2