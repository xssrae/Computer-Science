import math

print("Digite o valor da sua prestação")
valor_prestacao = float(input())
print("Digite o atraso em dias:")
qtde_dias = int(input())

multa = valor_prestacao/100*2.3
prestacaof = valor_prestacao+(valor_prestacao*(multa/100)*qtde_dias)

print(f"Seu valor a pagar é {prestacaof}")


