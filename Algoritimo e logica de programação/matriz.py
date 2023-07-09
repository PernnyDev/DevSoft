n = int(input("Digite o número de linhas da matriz: "))
m = int(input("Digite o número de colunas da matriz: "))

# criando a matriz com n linhas e m colunas
matriz = []
for i in range(n):
    linha = []
    for j in range(m):
        palavra = input(f"Digite a palavra da posição ({i},{j}): ")
        linha.append(palavra)
    matriz.append(linha)

# encontrando a menor e a maior palavra e suas posições
menor_palavra = matriz[0][0]
maior_palavra = matriz[0][0]
pos_menor_palavra = (0, 0)
pos_maior_palavra = (0, 0)

for i in range(n):
    for j in range(m):
        palavra = matriz[i][j]
        if len(palavra) < len(menor_palavra):
            menor_palavra = palavra
            pos_menor_palavra = (i, j)
        if len(palavra) > len(maior_palavra):
            maior_palavra = palavra
            pos_maior_palavra = (i, j)

# mostrando os resultados
print("Menor palavra:", menor_palavra, "na posição", pos_menor_palavra)
print("Maior palavra:", maior_palavra, "na posição", pos_maior_palavra)
