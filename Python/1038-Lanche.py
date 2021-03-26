A, B = [int(x) for x in input() .split()]

ValorLanche = 0.0

if(A == 1):
	valorLanche = 4.00
elif (A == 2):
	valorLanche = 4.50
elif (A == 3):
	valorLanche = 5.00
elif (A == 4):
	valorLanche = 2.00
else:
	valorLanche = 1.50

total = valorLanche*B
print("Total: R$ %.2f" %total)
	