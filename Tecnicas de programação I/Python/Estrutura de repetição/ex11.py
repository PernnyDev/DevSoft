# 11 Altere o programa anterior para mostrar no final a soma dos números.

n1 = int(input('Digite o primeiro número: '))
n2 = int(input('Digite o segundo número: '))

if n1 == n2:
        print('Os números são iguais! Tente novamente.')
        n1 = int(input('Digite o primeiro número: '))
        n2 = int(input('Digite o segundo número: '))
else:
    if n1 < n2:
        for i in range(n1, n2):
            print(i, end=' ')
        print(f'\nA soma dos números é: {sum(range(n1, n2))}')
    else:
        for i in range(n2, n1):
            print(i, end=' ')
        print(f'\nA soma dos números é: {sum(range(n2, n1))}')