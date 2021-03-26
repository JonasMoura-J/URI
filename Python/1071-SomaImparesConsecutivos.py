num = int(input())
num2 = int(input())

maior = num if num > num2 else num2

menor = num2 if num > num2 else num

soma = 0

for i in range(menor+1, maior):

    if (i % 2 != 0):
        soma += i
print(soma)

