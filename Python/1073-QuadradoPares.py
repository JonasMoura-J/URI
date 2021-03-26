numero = int(input())

iterate = 1
for i in range(1, numero+1):
    if (iterate % 2 == 0):
        num = int(pow(iterate, 2))
        print("{}^2 = {}".format(iterate, num))
    iterate+=1