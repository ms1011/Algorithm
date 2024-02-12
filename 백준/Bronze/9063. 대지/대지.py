import sys

"""
    첫째 줄에는 점의 개수 N
    N 개의 점을 둘러싸는 최소 크기의 직사각형의 넓이를 출력하시오. 
"""

n = int(input())

x, y = map(int, sys.stdin.readline().split())
max_x = x
max_y = y

min_x = x
min_y = y

for i in range(n-1):
    x, y = map(int, sys.stdin.readline().split())
    if x > max_x:
        max_x = x
    if y > max_y:
        max_y = y
    if x < min_x:
        min_x = x
    if y < min_y:
        min_y = y

print((max_x - min_x) * (max_y - min_y))