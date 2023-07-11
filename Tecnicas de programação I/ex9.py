# 9 Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

while True:
    print('1 - Imprimir números ímpares de 1 a 50 um abaixo do outro.')
    print('2 - Imprimir números ímpares de 1 a 50 um ao lado do outro.')
    opcao = int(input('Digite a opção desejada: '))
    if opcao == 1:
        for i in range(1,51):
            if i % 2 != 0:
                print(i)
        break
    elif opcao == 2:
        for i in range(1,51):
            if i % 2 != 0:
                print(i,end=' ')
        break
    else:
        print('Opção inválida! Tente novamente.')