import sys

"""
    대각선의 분모값과 분자값의 합이 T라고 하면 대각선 칸의 개수는 T-1개이다
    T가 짝수이면 우상향으로 홀수이면 좌하향으로 진행
    T % 2 == 0 일 때 우상향, 1일 때는 좌하향
"""

x = int(input())
line = 1

while x > line:
    x -= line
    line += 1
if line % 2 == 0:
    up = x
    down = line - x + 1
else:
    up = line - x + 1
    down = x

print(up,'/',down, sep="")