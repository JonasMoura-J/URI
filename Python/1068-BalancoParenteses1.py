# -*- coding: utf-8 -*-
"""
Created on Mon Apr  5 19:53:27 2021

@author: jonas
"""
while True:
    try:
        p = input()
        d = 0
        for i in range(len(p)):
            if(p[i]=='('):
                d += 1
            elif(p[i]==')'):
                d -= 1
            if(d < 0):
                break
        if(d != 0):
            print('incorrect')
        else:
            print('correct')
       
    except EOFError:
        break