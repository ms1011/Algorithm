import sys


t = int(sys.stdin.readline())

for i in range(t):
    r, s = sys.stdin.readline().split()
    for j in range(len(s)):
        print(s[j] * int(r), end='')
    print()

