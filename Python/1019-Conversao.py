seg = int(input())

quantidade = [3600, 60, 1]
result = []

for i in quantidade:
    qtd = int(seg/i)
    result.append(str(qtd))
    seg -= qtd * i

print(":".join(result))
