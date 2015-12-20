# -*- coding: utf-8 -*-
"""
Created on Sat Dec 19 22:28:02 2015
@author: MohamedAbedelmalik

Euler4.py
A palindromic number reads the same both ways. The largest palindrome made from
the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
"""





def makePalindrome(x):  
    y = str(x)+str(x)[::-1]
    return int(y)

def main():
    largest_product = 998001
    done = False
    x=111
    while not done:
        if makePalindrome(x) > largest_product:
            print (makePalindrome(x-1))
            done = True
        else:
            x = x+1
    
main()

    