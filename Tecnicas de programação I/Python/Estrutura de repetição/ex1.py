# 1 Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
while True:
    nota = int(input("Digite uma nota entre 0 e 10: "))
    if nota >= 0 and nota <= 10:
        print("Nota válida! ",nota)
        break
    else:
        print("Nota inválida! Tente novamente.")
