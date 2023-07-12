# 15 A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.

n = int(input("Digite o valor de n para gerar a série de Fibonacci: "))

fibonacci = [1, 1]

while len(fibonacci) < n:
    proximo = fibonacci[-1] + fibonacci[-2]
    fibonacci.append(proximo)

print("Série de Fibonacci até o", n, "º termo:")
for numero in fibonacci:
    print(numero, end=" ")