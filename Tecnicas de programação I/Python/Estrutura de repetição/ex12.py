# 12 Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada

n = int(input('Digite um número inteiro entre 1 e 10: '))

print(f'Tabuada do {n}:')

for i in range(1, 11):
    print(f'{n} x {i} = {n * i}')    