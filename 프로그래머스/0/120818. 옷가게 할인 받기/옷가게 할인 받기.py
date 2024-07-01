import math

def solution(price):
    if price >= 500000:
        return math.trunc(price * (100 - 20) / 100)
    if price >= 300000:
        return math.trunc(price * (100 - 10) / 100)
    if price >= 100000:
        return math.trunc(price * (100 - 5) / 100)
    else:
        return price