import numpy as np

def eh(elemento):
    numero = sum([c - elemento for c in C if c < elemento])
    print(numero)
    return numero

def busca_bin(lista, A):
    ini = 0
    fim = len(lista) - 1
    while ini <= fim:
        meio = (ini + fim) / 2
        
        if (eh(lista[meio]) == A):
            return meio
            print(lista[meio])
        elif (eh(lista[meio]) == A > A):
            fim = meio - 1
            print(lista[meio])
        else:
            ini = meio + 1
            print(lista[meio])
    return -1

while True:
    try:
        N, A = [int(y) for y in input().split()]
        if(N == A == 0):
            break
        C = [int(x) for x in input().split()]
            
        soma = 0
        for c in C:
            soma += c
        
        if(soma < A):
            print('-.-')   
        elif(soma == A):
            print(':D')
        else:
            lista = [1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0]
            print(lista)                
            print('%.4f' %busca_bin(lista, A))
        
    except EOFError:
        break
