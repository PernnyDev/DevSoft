# 13 Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

n1 = int(input("Digite um número: "))

dSemana = {1: "Domingo", 2: "Segunda-feira", 3: "Terça-feira", 4: "Quarta-feira",5: "Quinta-feira", 6: "Sexta-feira", 7: "Sábado"}

print(dSemana.get(n1, "Valor inválido!"))