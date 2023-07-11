# 3 Faça um programa que leia e valide as seguintes informações: (a) Nome: maior que 3 caracteres; (b) Idade: entre 0 e 150; (c) Salário: maior que zero; (d) Sexo: 'f' ou 'm'; (e) Estado Civil: 's', 'c', 'v', 'd';

nome = input("Digite seu nome: ")
while len(nome) <= 3:
    print("Nome inválido. Deve conter mais de 3 caracteres.")
    nome = input("Digite seu nome novamente: ")

idade = int(input("Digite sua idade: "))
while idade < 0 or idade > 150:
    print("Idade inválida. Deve estar entre 0 e 150.")
    idade = int(input("Digite sua idade novamente: "))

salario = float(input("Digite seu salário: "))
while salario <= 0:
    print("Salário inválido. Deve ser maior que zero.")
    salario = float(input("Digite seu salário novamente: "))

sexo = input("Digite seu sexo (f/m): ")
while sexo.lower() != 'f' and sexo.lower() != 'm':
    print("Sexo inválido. Deve ser 'f' ou 'm'.")
    sexo = input("Digite seu sexo novamente: ")

estado_civil = input("Digite seu estado civil (s/c/v/d): ")
while estado_civil.lower() not in ['s', 'c', 'v', 'd']:
    print("Estado civil inválido. Deve ser 's', 'c', 'v' ou 'd'.")
    estado_civil = input("Digite seu estado civil novamente: ")

print("Informações válidas:")
print("Nome:", nome)
print("Idade:", idade)
print("Salário:", salario)
print("Sexo:", sexo)
print("Estado Civil:", estado_civil)

