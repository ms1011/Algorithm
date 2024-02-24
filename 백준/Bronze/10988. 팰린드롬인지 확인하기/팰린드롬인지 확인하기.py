import sys


s = list(input())
r = s[::-1]
check = 1

for i in range(len(s)):
    if s[i] != r[i]:
        check = 0
print(check)
