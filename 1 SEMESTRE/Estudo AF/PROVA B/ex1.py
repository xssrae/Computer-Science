contador = 0

while True:
    conta = float(input('Digite o valor da conta:'))
    if conta <0:
        break
    elif conta <= 35.20 and conta >= 120.99:
        contador += 1

print('O total de pessoas que pagam a conta entre 35,00 a 120,00 é:')