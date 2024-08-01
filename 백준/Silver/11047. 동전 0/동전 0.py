N, K = map(int, input().split())
count = 0

coins = []
for i in range(N):
    coins.append(int(input()))
coins.sort(reverse=True)

for i in coins:
    if K // i < 0:
        continue
    count += K // i
    K = K % i

print(count)