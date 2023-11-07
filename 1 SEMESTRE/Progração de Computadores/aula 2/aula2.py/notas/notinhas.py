print("digite seu nome")
nome = input("seu nome aqui:")
print("digite a primeira nota")
nota1 = int(input("nota 1:"))
if type(nota1) == str:
    print("digite a nota corretamente, seu bobão")
print("digite a segunda nota")
nota2 = int(input("nota 2:"))
print("digite a terceira nota")
nota3 = int(input("nota 1:"))
print("digite a quarta nota:")
nota4 = int(input("nota 4:"))
print("digite sua turma")
turma = input("turma:")

media = (nota1 + nota2+ nota3+ nota4) / 4

print("nota 1: " , nota1)
print("nota 2: " , nota2)
print("nota 3: " , nota3)
print("nota 4: " , nota4)
print("Média: " , media)

if media>=5:
    print("PASSOU FEDENDO")
else:
    print("SE FUDEU")