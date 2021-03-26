num = float(input())
print((num >= 0 and num <= 25) and "Intervalo [0,25]"or (num > 25 and num <= 50)and"Intervalo (25,50]"or
			(num > 50 and num <= 75)and"Intervalo (50,75]"or(num > 75 and num <= 100)and"Intervalo (75,100]"or"Fora de intervalo")
