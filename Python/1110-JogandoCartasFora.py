# -*- coding: utf-8 -*-
"""
Created on Mon Apr  5 20:05:30 2021

@author: jonas
"""

while True:
    n = int(input())

    if n == 0 :
        break

    inicial = []
    for i in range(0,n):
        inicial.append(i+1)

    resultado = []
    while len(inicial) > 1:
        resultado.append(inicial.pop(0))
        inicial.insert(len(inicial)-1,inicial.pop(0))
    
    
    print("Discarded cards: " + str(resultado).replace("[","").replace("]",""))
    print("Remaining card: " + str(inicial[0]))