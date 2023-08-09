# 12 Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. (*) Desconto do IR: (*) Salário Bruto até 900 (inclusive) - isento (*) Salário Bruto até 1500 (inclusive) - desconto de 5% (*) Salário Bruto até 2500 (inclusive) - desconto de 10% (*) Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

valorHora = float(input('Digite o valor da hora trabalhada: '))
qtdHoras = float(input('Digite a quantidade de horas trabalhadas no mádia por dia: '))

salarioBruto = valorHora * qtdHoras * 22

if salarioBruto <= 900:
    taxaIR = 0
else:
    if salarioBruto <= 1500:
        taxaIR = 0.05
    else:
        if salarioBruto <= 2500:
            taxaIR = 0.10
        else:
            taxaIR = 0.20


print(f'Salário Bruto: R$ {salarioBruto:.2f}\n'
      f'(-) IR (5%) : R$ {salarioBruto * taxaIR:.2f}\n'
      f'(-) INSS (10%) : R$ {salarioBruto * 0.10:.2f}\n'
      f'FGTS (11%) : R$ {salarioBruto * 0.11:.2f}\n'
      f'Total de descontos : R$ {salarioBruto * (taxaIR + 0.10):.2f}\n'
      f'Salário Liquido : R$ {salarioBruto - salarioBruto * (taxaIR + 0.10):.2f}' )

