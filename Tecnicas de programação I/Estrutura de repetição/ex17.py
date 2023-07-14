# 16 Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 e print a fatoração

n1 = int (input("Digite um número: "))

for i in range(1, n1):
    n1 *= i
    print(n1, end=" ")