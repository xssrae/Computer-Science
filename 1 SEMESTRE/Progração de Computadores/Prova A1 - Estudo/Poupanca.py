poupanca = 0
acum = 0

#entradas
depositoI = float(input('Valor do deposito inicial:'))
taxaJ = float(input('Taxa de juros:'))

#juros sob o valor inicial
juros = (taxaJ/100)*depositoI

#poupança dos 24 meses
for i in range(25):
    aux = juros+depositoI #junção do juros com o depositoI
    poupanca = poupanca+aux #guardando na poupança
    #inicio de entrada de depositos variáveis
    depositoX = float(input('Qual o próximo deposito? '))
    aux = juros+depositoX
    acum = acum+aux
    poupanca = poupanca+acum
    print((i+1),'º Mês:', poupanca)
#junção do valor inicial com o valor acumulado durante os meses

print(f'O valor de lucro final após  meses é: {poupanca}')
