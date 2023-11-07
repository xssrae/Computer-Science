#Algoritimi que mostra itens disponiveis e preços, soma o total da compra e calcula desconto.
#Calcula se o pagamento é sulficiente para pagar a compra
#**Remove itens que passaram do preço. 
###############################################################

#empressão da lista
produtos = ['Maçã gala','Manga','Melancia','Jaca','Banana da Terra', 'Carne - kg']
cod = [1,2,3,4,5,6]
precos = [0.50, 1.00, 5.20, 6.40, 9.24, 24.60]
for i in range(len(produtos)):
    print(cod[i],'-',produtos[i],'...........', precos[i])

contador = 0 #conta o total de itens comprados
compra = 0
while True:
    codigo = int(input('Digite o código do produto: '))
    qtde = float(input('Digite a quantidade que deseja \n(0 para terminar a compra): '))
    contador = contador + 1
    if qtde == 0:
        break
    elif codigo == 1:
        compra = qtde*(compra + precos[0])
    elif codigo == 2:
        compra = qtde*(compra + precos[1])
    elif codigo == 3:
        compra = qtde*(compra + precos[2])
    elif codigo == 4:
        compra = qtde*(compra + precos[3])
    elif codigo == 5:
        compra = qtde*(compra + precos[4])
    elif codigo == 6:
        compra = qtde*(compra + precos[5])

print('O total de itens foi: ', contador)
print('O total da compra foi: ', compra)

