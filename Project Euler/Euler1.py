# -*- coding: utf-8 -*-
"""
Created on Fri Dec 18 19:08:42 2015
@author: MohamedAbedelmalik

If we list all the natural numbers below 10 that are multiples of 3 or 5, we 
get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
"""

def main(limit):
    #Creates the series of numbers divisible by 3 and 5
    x = [ i for i in range(limit) if (i%3==0 or i%5==0) and i!=0]
    
    #Adds all of the numbers divisible by 3 and 5 together
    ans = 0
    for i in x:
        ans = ans + i
    
    return ans
    
    
print(main(1000))