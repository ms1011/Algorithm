import sys

n, m = map(int, sys.stdin.readline().split())

b = [i for i in range(1, n+1)]

for i in range(m):
    x, y = map(int, sys.stdin.readline().split())
    z = b[x-1]
    b[x-1] = b[y-1]
    b[y-1] = z

for i in range(n):
    print(b[i], end=' ')
