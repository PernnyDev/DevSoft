# 14 Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo: (*) Média de Aproveitamento  Conceito (*) Entre 9.0 e 10.0        A (*) Entre 7.5 e 9.0         B (*) Entre 6.0 e 7.5         C (*) Entre 4.0 e 6.0         D (*) Entre 4.0 e zero        E (*) O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

n1 = float(input("Digite a primeira nota: "))
n2 = float(input("Digite a segunda nota: "))

media = (n1 + n2) / 2

if media >= 0 and media < 4:
    print(f'Média: {media:.2f}\n'
      f'Conceito: E'
      f'\nREPROVADO')
elif media >= 4 and media < 6:
    print(f'Média: {media:.2f}\n'
      f'Conceito: D'
      f'\nREPROVADO')
elif media >= 6 and media < 7.5:
    print(f'Média: {media:.2f}\n'
      f'Conceito: C'
      f'\nAPROVADO')
elif media >= 7.5 and media < 9:
    print(f'Média: {media:.2f}\n'
      f'Conceito: B'
      f'\nAPROVADO')
else:
    print(f'Média: {media:.2f}\n'
          f'Conceito: A'
          f'\nAPROVADO')
    
