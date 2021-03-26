x = int(input())
inp = 0
out = 0
for i in range(0, x):
    y = int(input())
    if(y>=10 and y <=20):
        inp+=1
    else:
        out+=1

print("%d in"%inp)
print("%d out"%out)