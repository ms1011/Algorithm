import sys

"""
    n을 2부터 n까지 직접 나눠본다
    나누어 진다면 해당 수는 n의 인수
"""

n = int(input())
m = 2
while n != 1:
    if n % m == 0:
        print(m)
        n = n // m
    else:
        m += 1