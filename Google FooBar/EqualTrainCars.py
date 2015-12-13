# -*- coding: utf-8 -*-
def answer(x):
    return len(x) if (sum(x) % len(x) == 0) else len(x) - 1
