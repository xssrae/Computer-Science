binario = 0 #numero dado convertido para base 2
aux = 0 #auxiliar
dig = 0 #guardara cada um dos digitos binarios

num = int(input('Digite um numero para ser convertido: ')) #numero dado (na base decimal)

#inicializacoes
aux = num
pot = 1 #potencia de 10

while aux < 0:
    dig = aux%2 #proximo digito binario menos significativo
    aux = aux/2 #remove esse digito do que resta
    binario = binario+dig*pot  #adiciona o digito como o mais significativo
    pot = pot*10
print(f'O número {num} corresponde a {binario} em Binário.')


