# -*- coding: utf-8 -*-
"""
Created on Tue Mar 23 22:46:13 2021

@author: jonas
"""

L = str(input()) #Lista antiga
N = str(input()) #nova Lista
S = str(input()) #Rede de amigos que desja indicar

listaL = L.split(" ");
listaN = N.split(" ");

if(S != "nao"):
    indice = listaL.index(S)
    for x in listaN:
        listaL.insert(indice, x)
        indice+=1
else:
    listaL.extend(listaN)

lista = ""
for x in listaL:
    ehUltimoElemento = listaL.index(x) == len(listaL)-1;
    if(ehUltimoElemento):
        lista += x
    else:
        lista += x + " "
print(lista)