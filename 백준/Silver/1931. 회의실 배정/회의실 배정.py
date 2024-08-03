n = int(input())

table = []

for i in range(n):
    table.append(list(map(int, input().split())))

table = sorted(table, key=lambda x: (x[1], x[0]))


cur = table[0]
cnt = 1

for i in range(1, n):
    if table[i][0] < cur[1]:
        continue
    else:
        cur = table[i]
        cnt += 1
print(cnt)