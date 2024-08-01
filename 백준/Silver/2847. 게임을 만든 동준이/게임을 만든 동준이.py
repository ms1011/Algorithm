n = int(input())
count = 0
level = []
for i in range(n):
    level.append(int(input()))

for i in range(n-1, 0, -1):
    while level[i] <= level[i-1]:
        level[i-1] -= 1
        count += 1
print(count)