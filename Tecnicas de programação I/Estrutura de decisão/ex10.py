# 10 Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

turno = ""

while turno != "M" and turno != "V" and turno != "N":
    turno = input(
        "Digite o turno em que você estuda M-matutino; V-vespertino; N-noturno: ").upper()

    if turno == "M":
        print("Bom dia!")
        break
    else:
        if turno == "V":
            print("Boa tarde!")
            break
        else:
            if turno == "N":
                print("Boa Noite!")
                break
    print("Valor inválido!")
