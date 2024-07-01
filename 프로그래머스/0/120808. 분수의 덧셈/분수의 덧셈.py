import math

def solution(numer1, denom1, numer2, denom2):
    answer = []
    x = numer1 * denom2 + numer2 * denom1
    y = denom1 * denom2
    gcd = math.gcd(y, x)
    answer.append(x // gcd)
    answer.append(y // gcd)
    return answer