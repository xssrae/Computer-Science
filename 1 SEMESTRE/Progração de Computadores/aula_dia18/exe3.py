#exercício 3
import math

print('Quantos DIAS de vida você têm?')
print('digite o dia de nascimento:')
dia = int(input())
print('Digite o mês de nascimento:')
mes = int(input())
print('Digite o ano de nascimento:')
ano = int(input())
ano_atual = 2022

idade = ano_atual-ano
idade_em_dia = idade*365
diferenca = dia - 30

print(f"Você nasceu a {idade_em_dia} dias e têm {idade} anos. ")