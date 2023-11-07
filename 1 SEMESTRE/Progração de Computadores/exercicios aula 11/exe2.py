
lista1 = []
lista2 = []
aux = []

#1º lista
print('Primeira lista de números.')
print()
for i in range(5):
    lista1 = int(input(f'{i+1}º Número: '))
    
#2º lista
print('Segunda lista de números.')
print()
for i in range(5):
    lista2 = int(input(f'{i+1}º Número: '))

#intersecção de lista
for v2 in lista2:
    for v1 in lista1:
        if v2 == v1:
            aux.append(lista2)
        
        
if len(aux) != 0:
    print(aux)
else:
    print('Não existem elementos que se repitam')
