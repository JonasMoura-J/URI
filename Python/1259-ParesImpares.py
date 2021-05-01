# -*- coding: utf-8 -*-
"""
Created on Wed Mar 24 22:18:53 2021

@author: jonas
"""
N = int(input())

listaGeral = []
listaPares = []
listaImpares = []
for i in range(0, N):
    x = str(input())
    if(int(x)%2 == 0):
        listaPares.append(int(x))
    else:
        listaImpares.append(int(x))

listaParesOrdenada = sorted(listaPares)
listaImparesOrdenada = sorted(listaImpares, reverse=True)
listaFinal = listaParesOrdenada + listaImparesOrdenada

listaString = []
for x in listaFinal:
    listaString.append(str(x))
print('\n'.join(listaString))