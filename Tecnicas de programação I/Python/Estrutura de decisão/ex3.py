# 3 Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

while True: 
    sexo = input("Digite seu sexo 'F' ou 'M': ")
    if sexo == "F" or sexo == "f":
        print("Feminino")
        break
    elif sexo == "M" or sexo == "m":
        print("Masculino")
        break
    else:
        print("Sexo inválido! Tente novamente.")