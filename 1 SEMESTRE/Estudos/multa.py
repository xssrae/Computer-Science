kmH = float(input('Digite a velocidade do carro: '))

if kmH >= 80.0:
    multa = kmH*5
    print(f'Você foi multado por passar de 80km/h.\nSeu total a pagar é {multa}')
else:
    print('Você não foi multado.')