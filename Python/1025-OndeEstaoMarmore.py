from bisect import bisect_left

def busca_bin_bisect(lista, elemento):
    i = bisect_left(lista, elemento)
    if i != len(lista) and lista[i] == elemento:
        return i
    return -1

for i in range(1,65):
    N, Q = [int(x) for x in input().split()]
    if N == 0 and Q == 0:
        break

    print("CASE# %d:" % i)
    lista = []
    for i in range(N+Q):
        if i < N:
            lista.append(int(input()))

        if i == (N-1):
            lista.sort()

        if i >= N:
            pesq = int(input())
            index = busca_bin_bisect(lista, pesq)

            if index == -1:
                print(str(pesq) + " not found")
            else:
                print(str(pesq) + " found at " + str(index+1))