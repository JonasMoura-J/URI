# -*- coding: utf-8 -*-
"""
Created on Wed Mar 24 13:47:58 2021

@author: jonas
"""

N = int(input())  # Quantidade de alunos

lista = []

for i in range(0, N):
    # A = nome do aluno
    # S = sigla para a região onde ele mora
    # C = Custo da entrada da cidade até sua casa
    x = str(input())
    linha = x.split()
    lista.append(sorted(linha, key=len, reverse=True))

for x in lista:
    frase = ""
    for y in x:
        ehUltimoElemento = x.index(y) == len(x) - 1;
        if (ehUltimoElemento):
            frase += y
        else:
            frase += y + " "

    print(frase)