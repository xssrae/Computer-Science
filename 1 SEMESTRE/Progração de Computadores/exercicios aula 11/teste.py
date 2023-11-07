from collections import defaultdict
import string
#DICIONARIO do alfabetos
alfabetos = defaultdict(int)

#PERCORRENDO A STRING (caractere por caractere)
word = str(input('Digite um texto aleatório: ')).upper()
for letra in string.lower():

    if 'a' <= letra <= 'z':
        alfabetos[letra] += 1  # agora basta somar