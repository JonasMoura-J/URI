import math
A, B = [float(x) for x in input() .split()]
C, D = [float(x) for x in input() .split()]

distancia = math.sqrt(pow((C-A), 2) + pow((D-B), 2))
print("%.4f"%distancia)