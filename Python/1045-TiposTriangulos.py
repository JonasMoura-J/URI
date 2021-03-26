X1, X2, X3 = [float(x) for x in input() .split()]
vect = [X1, X2, X3]
vect.sort()
vect.reverse()

A = vect[0]
B = vect[1]
C = vect[2]

if (A >= B + C):
    print("NAO FORMA TRIANGULO")
else:
    if (pow(A, 2) == pow(B, 2) + pow(C, 2)):
        print("TRIANGULO RETANGULO")
    if (pow(A, 2) > (pow(B, 2) + pow(C, 2))):
        print("TRIANGULO OBTUSANGULO")
    if (pow(A, 2) < (pow(B, 2) + pow(C, 2))):
        print("TRIANGULO ACUTANGULO")
    if (A == B and B == C):
        print("TRIANGULO EQUILATERO")
    if ((A == B and A != C) or (B == C and B != A) or (A == C and A != B)):
        print("TRIANGULO ISOSCELES")