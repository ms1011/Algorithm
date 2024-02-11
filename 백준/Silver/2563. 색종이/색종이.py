import sys

n = int(input())
arr = [[0] * 100 for i in range(100)]

for i in range(n):
    x, y = map(int, sys.stdin.readline().split())

    for row in range(x, x+10):
        for col in range(y, y+10):
            arr[row][col] = 1

res = 0

for i in arr:
    res += sum(i)

print(res)