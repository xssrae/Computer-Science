#declaração de variáveis
conta1 = 0
conta2 = 0
idades = 0
acum = 0
pessoas = 0

print('Pesquisa de bairro INICIADA.')
while True:
    idade = int(input('Digite sua idade: '))
    salario = float(input('Digite seu salário: '))
    idades += idade
    pessoas += 1
    if not(idade > 0):
        break
    else:
        for i in range(pessoas):
            if idade >= 40: #acumulador de salários e pessoas com 40+
                conta1 += 1 
                acum += salario
            elif salario < 600.00: #acumulador para quem recebe menos que 600.00
                conta2 = conta2 + 1


print('Fim da pesquisa do bairro')
print()
print(f'A média de idade do grupo é: {idades//pessoas:.2f}')
print(f'A média salárial para pessoas com mais de 40 anos é de: R${acum//conta1:.2f}')
print(f'A quantidade de pessoas com salário menor que R$600.00 é: {conta2:.1f}')
