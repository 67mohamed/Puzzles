# -*- coding: utf-8 -*-
"""
Created on Sat Dec 19 21:01:59 2015
@author: MohamedAbedelmalik

Euler3.py
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
"""


def largest_prime_factor(number):
    #Base case. If the number divided by x equals one that means the 
    #calculation is done.    
    if number ==1 :
        return 1
    #Keeps dividing number by the smallest integer it can.
    else:
        x = 2
        while number % x !=0:
            x = x + 1
        #Return the largest divisible number if the calculation is done
        if largest_prime_factor(number // x) == 1: print(x)

largest_prime_factor(600851475143)

        