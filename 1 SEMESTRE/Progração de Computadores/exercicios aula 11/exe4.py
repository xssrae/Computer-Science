nomes = []
notas = []
cursos = []

#contadoores
qtdetads = 0
qtdeacima = 0
#acumulador
soma  = 0

while True:
    nomes.append(input('Digite o nome do aluno:'))
    nota = float(input('Digite a nota do aluno \n(Nota negativa para sair):'))
    if nota < 0:
        break
    nota.append(nota)
    cursos.append(input('Digite tads ou ccp'))

#item A
for c in cursos:
    if c.lower() == 'tads':
        qtdetads += 1

#item b
for n in notas:
    soma += n
media = soma/len(notas)

#item c
for n in notas:
    if n > media:
        qtdeacima += 1 #qdeacima = qdeacima + 1

print('Quantide de alunos de TADS: ', qtdetads)
print('Média das notas: ', media)
print('Acima da média: ', qtdeacima )