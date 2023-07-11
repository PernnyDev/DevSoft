# 10 Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

n1=int(input('Digite o primeiro número: '))
n2=int(input('Digite o segundo número: '))

while True:
    if n1 < n2:
        for i in range(n1,n2):
            print(i, end=' ')
        break
    elif n1 > n2:
        for i in range(n2,n1):
            print(i, end=' ')
        break
    else:
        print('Os números são iguais! Tente novamente.')
        n1=int(input('Digite o primeiro número: '))
        n2=int(input('Digite o segundo número: '))