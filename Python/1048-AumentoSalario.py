salario = float(input())
percentual = 0
percent = 0.0

if (salario >= 0 and salario <= 400.00):
    percentual = 15
    percent = 1.15
elif (salario > 400.00 and salario <= 800.00):
    percentual = 12
    percent = 1.12
elif(salario > 800.00 and salario <= 1200.00):
    percentual = 10
    percent = 1.10
elif(salario > 1200.00 and salario <= 2000.00):
    percentual = 7
    percent = 1.07
elif(salario > 2000.00):
    percentual = 4
    percent = 1.04

novoSalario = salario * percent
reajuste = novoSalario - salario

print("Novo salario: %.2f"%novoSalario)
print("Reajuste ganho: %.2f"%reajuste)
print("Em percentual: {} %".format(percentual))