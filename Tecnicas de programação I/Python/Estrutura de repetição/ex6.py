# 6 Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.

while True:
    print('1 - Imprimir números de 1 a 20 um abaixo do outro.')
    print('2 - Imprimir números de 1 a 20 um ao lado do outro.')
    opcao = int(input('Digite a opção desejada: '))
    if opcao == 1:
        for i in range(1,21):
            print(i)
        break
    elif opcao == 2:
        for i in range(1,21):
            print(i,end=' ')
        break
    else:
        print('Opção inválida! Tente novamente.')