from bisect import bisect_left, bisect_right

while True:
    try:
        N = int(input())
    except EOFError:
        break
    except:
        continue
    
    parafusos = []
    for i in range(0, N):
        a, b = [int(y) for y in input().split()]
        for i in range(a,b+1):
            parafusos.append(i)
            
    pesquisa = int(input())
    if pesquisa not in parafusos:
        print(f'{pesquisa} not found')
    else:
        parafusos.sort()
        indice_esquerda = bisect_left(parafusos, pesquisa)
        indice_direita = bisect_right(parafusos, pesquisa)
        
        print(f'{pesquisa} found from {indice_esquerda} to {indice_direita-1}')