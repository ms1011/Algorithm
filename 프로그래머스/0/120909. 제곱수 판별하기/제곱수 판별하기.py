import math

def solution(n):
    answer = 0
    x = int(math.isqrt(n))
    if x ** 2 == n:
        answer = 1
    else:
        answer = 2
    return answer