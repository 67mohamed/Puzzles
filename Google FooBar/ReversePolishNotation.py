# -*- coding: utf-8 -*-
"""
Created on Sun Oct 25 18:58:30 2015

@author: MohamedAbedelmalik
"""

def answer(str):
    # your code here
    ans = ""
    ans_stack = []
    star_stack = []
    plus_stack = []
    
    for i in str:
        if (i != "*") and (i != "+"):
            ans_stack.append(i)
        elif i == "*":
            star_stack.append(i)
    
        elif i == "+":
            plus_stack.append(i)            
            
            #Dump star_stack into ans_stack
            while star_stack:
                ans_stack.append(star_stack.pop())
    while star_stack:
        ans_stack.append(star_stack.pop())
    while plus_stack:
        ans_stack.append(plus_stack.pop())
    for i in ans_stack:
        ans = ans + i
    return(ans)

print(answer("2+3*4"))