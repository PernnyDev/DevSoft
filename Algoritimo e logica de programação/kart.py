import random

# Definindo o número de voltas e corredores
num_voltas = 10
num_corredores = 6

# Criando uma matriz vazia para armazenar os tempos de volta
tempos = [[0 for _ in range(num_voltas)] for _ in range(num_corredores)]

for valL in range(num_corredores):
    for valC in range(num_voltas):
        tempos[valL][valC] = random.randint(40, 120) # tempos aleatórios entre 50 e 80 segundos

# Calculando o melhor tempo de cada corredor e a melhor volta da prova
melhor_tempo_corredor = [min(tempos[valL]) for valL in range(num_corredores)]
melhor_volta_prova = min(melhor_tempo_corredor)
corredor_melhor_volta = melhor_tempo_corredor.index(melhor_volta_prova) + 1
volta_melhor_volta = tempos[corredor_melhor_volta - 1].index(melhor_volta_prova) + 1

# Calculando a média de cada volta e a soma do tempo da volta com menor média
media_voltas = [sum(tempos[valL][valC] for valL in range(num_corredores))/num_corredores for valC in range(num_voltas)]
volta_menor_media = media_voltas.index(min(media_voltas)) + 1
soma_tempo_volta = sum(tempos[valL][volta_menor_media - 1] for valL in range(num_corredores))


# Calculando a classificação final dos corredores
soma_tempo_corredor = [sum(tempos[valL]) for valL in range(num_corredores)]
classificacao = sorted(range(num_corredores), key=lambda x: soma_tempo_corredor[x])


print(f'A melhor volta da prova foi a {volta_melhor_volta}º volta, do corredor {corredor_melhor_volta} e teve o tempo de {melhor_volta_prova}s\nA classificação da corrida foi a seguinte:\n{classificacao}\nA volta com a menor média de tempos foi a {volta_menor_media}')