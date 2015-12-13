# -*- coding: utf-8 -*-
"""
Created on Sun Nov  1 17:59:45 2015

@author: MohamedAbedelmalik
"""

def toStr(n,base):
   convertString = "0123456789ABCDEF"
   if n < base:
      return convertString[n]
   else:
      return toStr(n//base,base) + convertString[n%base]

print(toStr(8,3))

