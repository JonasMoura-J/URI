# -*- coding: utf-8 -*-
"""
Created on Mon Apr  5 20:47:35 2021

@author: jonas
"""

def possibilidade():
    xy = str(input()).split() 
    carros = int(xy[0]) 
    vagas = int(xy[1]) 
    if carros==0 and vagas==0: 
        return False 
    h = [None]carros
    e = [None]carros
    s = [None]*carros
    for i in range(carros):
        h[i] = str(input()).split()
        e[i] = int(h[i][0])
        s[i] = int(h[i][1])
        momento = 0 
        for k in range(max(s)+1):
            if k in e:
                momento = momento + 1 
                if momento>vagas: return "Nao" 
                elif k in s: 
                    if s.index(k)==(len(s)-1) or s[len(s)-2]<e[len(e)-1]: 
                        momento = momento - 1 s.pop(s.index(k)) 
                        elif s.index(k)!=(len(s)-1): 
                            return "Nao" return "Sim" 
                        cond = True 
                        while cond!=False: 
                            f = possibilidade() 
                            if f==False: 
                                cond = False 
                                else: print(f)f