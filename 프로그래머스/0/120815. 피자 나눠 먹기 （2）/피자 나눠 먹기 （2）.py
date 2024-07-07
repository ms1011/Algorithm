import math

def solution(n):
    answer = n // math.gcd(n, 6)
    return answer