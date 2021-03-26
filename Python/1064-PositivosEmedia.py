numerosPositivos = []
media = 0
index = 1

for i in range(0, 6):
    numero = float(input())
    if (numero > 0):
        numerosPositivos.append(numero)
        media += numero
        index+=index
mediaFinal = media/len(numerosPositivos)
print("%.0f valores positivos"%len(numerosPositivos))
print("%.1f" %mediaFinal);

