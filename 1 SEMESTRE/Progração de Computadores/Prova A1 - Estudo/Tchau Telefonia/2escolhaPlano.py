#ESCOLHA DO PLANO
planos = [1,2,3,4,5]

print('Para começar, escolha o plano que deseja contratar:')
for i in range(len(planos)):
    print(planos[1], 'Móvel 500mb (Semanal)')
    print(planos[2], 'Móvel Simples 1GB (Mensal)')
    print(planos[3], 'Móvel Controle 3BG (Mensal)')
    print(planos[4], 'Móvel Controle 5gb + 500mb - REDES SOCIAIS (Mensal)')
    print(planos[5], 'Móvel Controle 7GB + 500 - Débito altomático (Mensal)')

while True:
    plano = int(input('Plano:'))
    if plano <= 0 or plano > 5:
        print('Escolha um plano válido.')
        resp = str(input('Deseja tentar novamente? \n(S para Sim, N para Não.'))
        if resp == 'N':
            break
    elif plano == 1:
        print('Móvel 500mb (Semanal) - R$10,00')
        resp = str(input('Deseja contratar? \n(S-SIM/N-NÃO)')).upper()
        if resp == 'S':
            print('Plano contratado com Sucesso.')
    elif plano == 2:
        print('Móvel Simples 1GB (Mensal) - ')
        resp = str(input('Deseja contratar? \n(S-SIM/N-NÃO)')).upper()
        if resp == 'S':
            print('Plano contratado com Sucesso.')
