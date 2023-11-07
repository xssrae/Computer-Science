valoresT = []
acum = 0
acima = 0

print('Digite o valor gasto com transporte:')
for i in range(15):
    print('Dia','-',(i+1))
    valor = float(input())
    valoresT.append(valor)
    acum = acum + valor

media = acum/15

for m in range(len(valoresT)):
    if m > media:
        acima+=1

print('Valor total gasto com transporte durante os 15 dias:', acum)
print('A média de gastos é: ', media)
print('Qtde de dias que o gasto foi acima da média:', acima)
