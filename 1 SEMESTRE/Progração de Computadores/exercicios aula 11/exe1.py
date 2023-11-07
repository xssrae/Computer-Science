valores = list()
par = []
impar = []

#entrada na lista 'valores' e verificação
while True:
    num = int(input('Digite o um número inteiro: '))
    valores.append(num)
    resp = str(input('Deseja continuar? \n(S para Sim/ N para Não): ')).upper()
    if resp == 'N':
        print('Fim da lista.')
        break
#separação de pares e impares
for idx in range(len(valores)):
    if valores[idx] %2==0:
        par.append(valores[idx])
    else:
        impar.append(valores[idx])

#impressão da lista
print()
print(f'Os valores listados foram: {valores}')
print(f'Os números Pares são: {par}')
print(f'Os números Impares são: {impar}')