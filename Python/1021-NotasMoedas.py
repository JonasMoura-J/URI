
valor = float(input())
notas = [100, 50, 20, 10, 5, 2]
moedas = [1, 0.50, 0.25, 0.10, 0.05, 0.01]

print("NOTAS:")
for nota in notas:
    qtdNotas = int(valor/nota)
    print("{} nota(s) de R$ {:.2f}".format(qtdNotas, nota))
    valor -= qtdNotas*nota

print("MOEDAS:")
for i in moedas:
    qtdMoedas = int(round(valor,2)/i)
    print("{} moeda(s) de R$ {:.2f}".format(qtdMoedas, i))
    valor -= qtdMoedas*i