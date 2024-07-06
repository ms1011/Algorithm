import math

def solution(a, b):
    b = b / math.gcd(a, b)
    for i in [2, 5]:
        while b % i == 0:
            b = b // i
    if b == 1:
        answer = 1
    else:
        answer = 2
    return answer