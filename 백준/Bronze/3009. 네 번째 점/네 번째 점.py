import sys

"""
    입력값들을 배열에 저장
    x 값 중 1개인 값과 y 값 중 1개인 값이 없는 좌표
"""

x = []
y = []

for i in range(3):
    a, b = map(int, sys.stdin.readline().split())
    x.append(a)
    y.append(b)

for i in range(3):
    if x.count(x[i]) == 1:
        new_x = x[i]
    if y.count(y[i]) == 1:
        new_y = y[i]

print(new_x, new_y)
