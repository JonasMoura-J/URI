A, B = [float(x) for x in input() .split()]

if (A > 0 and B > 0):
    print("Q1")
elif (A  < 0 and B > 0):
    print("Q2")
elif (A < 0 and B < 0):
    print("Q3")
elif (A > 0 and B < 0):
    print("Q4")
elif(A == 0 and B != 0):
    print("Eixo Y")
elif(A != 0 and B == 0):
    print("Eixo X")
else:
    print("Origem")
