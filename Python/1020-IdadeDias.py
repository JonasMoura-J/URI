valor = int(input())

anos = int(valor/360)
meses = int((valor - anos*365)/30)
dias = int((valor - anos*365)- meses*30)

print("%d ano(s)"%anos)
print("%d mes(es)"%meses)
print("%d dia(s)"%dias)