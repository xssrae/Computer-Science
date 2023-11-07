placa = []
multas = []
qtdeCarros = 0
soma = 0

for i in range(5):
    placa = str(input('Digite a placa do carro: ')).upper()
    multas = float(input('Digite o valor da multa: '))
    if multas[i] > 300.00:
            qtdeCarros = qtdeCarros + 1

media = soma/len(multas)

print('Quantas multas são > 300: ', qtdeCarros)
print('Média das multas: ', media)
    
