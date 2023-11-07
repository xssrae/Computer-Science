#PRECISO DISSO AQUI POR ALGUM MOTIVO SÓ Q EM UMA CONVERSÃO DE BINÁRIOS
# varrer todos os valores de x
x = 0
while x <= 1:
    print('para x igual a', x)

    # varrer os valores de y, para cada valor de x
    y = 0
    while y <= 1:
        print('    (', x, ',', y, ')'  )
        y = y + 1

    x = x + 1 