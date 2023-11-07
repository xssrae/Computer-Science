estoque = []
produto = []
acum = 0
contador = 0
abaixo = 0

while True:
    item = str(input('Nome do produto:'))
    qtde = int(input('Qtde no estoque:'))
    produto = [item,qtde]
    estoque.append(produto)
    acum = acum + qtde
    if item != str or qtde != int:
        break

media = acum/len(estoque)


for item,qtde in range(len(estoque)):
    if estoque[item,qtde] < media:
        abaixo += 1
        print('Produto ')




