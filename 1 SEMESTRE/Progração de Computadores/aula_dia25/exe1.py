print('digite seu turno de trabalho:')
turno = str(input()) 
print('digite suas horas trabalhadas:')
horas = float(input())

if turno == ('N'):
  print('Sua hora de trabalho equivale a R$45.00 semanais')
  print('Seu salário é de',22*(horas*45.00), 'reais mensais')
elif turno == ('M'):
  print('Sua hora de trabalho equivale a R$37.50 semanais')
  print(f'Seu salário é de',22*(horas*37.50),'reais mensais')
else:
  print('Verifique os dados digitados incorretamente')

