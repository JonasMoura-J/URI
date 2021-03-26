a, b, c = [int(x) for x in input() .split()]

if((b+c>a)and(a+c>b)and(b+a>c)):
    perime = a+b+c
    print("Perimetro = %.1f"%perime)
else:
    area = (a+b)*c/2
    print("Area = %.1f"%area)


