#declaração  de variaveis 
lista_de_pessoas = []
i = 0

print('Calculadora de peso ideal INICIADA.')

while True:
    sexo = str(input('Digite o sexo \nF ou M: '))
    altura = float(input("Digite a altura: "))
    pessoa = [sexo, altura]
    lista_de_pessoas.append(pessoa)
    if not (sexo == 'F' or sexo == 'M'):
        break

print()
for sexo, altura in lista_de_pessoas:
    if sexo == 'F':
        peso = 62.1*altura - 44.7
        print(f'para altura {altura} do grupo feminino o peso ideal é {peso:.2f}')
    if sexo == 'M':
        peso = 72.7*altura - 58
        print(f'para altura {altura} do grupo masculino o peso ideal é {peso:.2f}')

