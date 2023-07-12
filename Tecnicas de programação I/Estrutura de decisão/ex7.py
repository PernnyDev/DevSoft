# 7 Faça um Programa que leia três números e mostre o maior e o menor deles.

n1 = float(input("Digite o primeiro número: "))
n2 = float(input("Digite o segundo número: "))
n3 = float(input("Digite o terceiro número: "))

print("O maior número é: ", max(n1, n2, n3),
      "O menor número é: ", min(n1, n2, n3))
