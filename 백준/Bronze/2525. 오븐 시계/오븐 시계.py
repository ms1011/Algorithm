H, M = map(int, input().split())
b = int(input())

H += b // 60
M += b % 60

if M >= 60:
    H += 1
    M -= 60
if H >= 24:
    H -= 24

print(H, M)
