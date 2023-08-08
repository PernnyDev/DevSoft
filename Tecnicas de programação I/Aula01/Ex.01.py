# Faça um programa que peça o nome, a altura e o peso de duas pessoas e apresente o nome da mais pesada e o nome da mais alta.

nome1 = input("Digite o nome da primeira pessoa: ")
altura1 = float(input("Digite a altura da primeira pessoa: "))
peso1 = float(input("Digite o peso da primeira pessoa: "))
nome2 = input("Digite o nome da segunda pessoa: ")
altura2 = float(input("Digite a altura da segunda pessoa: "))
peso2 = float(input("Digite o peso da segunda pessoa: "))
if peso1 > peso2:
    print(f"{nome1} é mais pesado(a) que {nome2}")
elif peso1 < peso2:
    print(f"{nome2} é mais pesado(a) que {nome1}")
else:
    print(f"{nome1} e {nome2} tem o mesmo peso")
if altura1 > altura2:
    print(f"{nome1} é mais alto(a) que {nome2}")
elif altura1 < altura2:
    print(f"{nome2} é mais alto(a) que {nome1}")
else:
    print(f"{nome1} e {nome2} tem a mesma altura")
    