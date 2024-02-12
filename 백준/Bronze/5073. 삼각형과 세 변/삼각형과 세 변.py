import sys

"""
    Equilateral :  세 변의 길이가 모두 같은 경우
    Isosceles : 두 변의 길이만 같은 경우
    Scalene : 세 변의 길이가 모두 다른 경우
    Invalid : 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면
"""

while True:
    a, b, c = map(int, sys.stdin.readline().split())
    if a == b == c == 0:
        break
    if max(a,b,c) >= a+b or max(a,b,c) >= a+c or max(a,b,c) >= b+c:
        print("Invalid")
    elif a == b == c:
        print("Equilateral")
    elif a == b or b == c or a == c:
        print("Isosceles")
    elif a != b != c:
        print("Scalene")