#exercicío 1

import math

print("Calculando o tronco de uma pirâmide qualquer.")

print("Digite a altura:")
altura = float(input())
print("Digite a base menor:")
b_menor = float(input())
print("Digite a base maior:")
b_maior = float(input())

volume = altura/3*(b_maior**2+b_menor**2)**0.5
print(f"A pirâmide têm um tronco na medida de {volume} de volume")
