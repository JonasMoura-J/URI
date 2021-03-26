
dinheiro = int(input())
print(dinheiro)
cedulas = [100, 50, 20, 10, 5, 2, 1]

for i in cedulas:
     qtdCedulas = int(dinheiro/i)
     print("{} nota(s) de R$ {},00".format(qtdCedulas, i))
     dinheiro -= qtdCedulas*i


