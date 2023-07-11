# 5 Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.


populacao_a = int(input("Digite a população do país A: "))
taxa_crescimento_a = float(input("Digite a taxa de crescimento do país A: "))

populacao_b = int(input("Digite a população do país B: "))
taxa_crescimento_b = float(input("Digite a taxa de crescimento do país B: "))

anos = 0

while populacao_a < populacao_b:
    populacao_a += populacao_a * taxa_crescimento_a
    populacao_b += populacao_b * taxa_crescimento_b
    anos += 1

print("Levará", anos, "anos para que a população do país A ultrapasse ou iguale a população do país B.")