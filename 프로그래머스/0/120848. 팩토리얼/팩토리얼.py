import math

def solution(n):
    answer = 0
    i = 1
    while math.factorial(i) <= n:
        answer = i
        i += 1
    return answer