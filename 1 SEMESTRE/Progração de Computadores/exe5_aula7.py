print('digite o valor de seu salario:')
salario = float(input())
print('digite seu tempo de trabalho em anos:')
tempo = int(input())

if salario > 1500.00:
    if tempo <3:
        gratificacao = 200.00
    else:
        gratificacao = 300.00
else:
    if tempo <=3:
        graftificacao = 230.00
    elif tempo <=6:
        gratificacao = 330.00
    else:
        gratificacao = 350.00

total = salario + gratificacao

print(f'Seu salário foi de {gratificacao:.2f}, ao todo foi {total:.2f}')