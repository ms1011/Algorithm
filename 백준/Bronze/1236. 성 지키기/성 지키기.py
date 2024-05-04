x, y = map(int, input().split())
arr = [[0] * y for _ in range(x)]
row = 0
col = 0

for i in range(x):
    line = input()
    flag = False
    for j in range(y):
        arr[i][j] = line[j]
        if line[j] == 'X':
            flag = True
    if flag == False:
        col += 1

for i in range(y):
    if 'X' not in [arr[j][i] for j in range(x)]:
        row += 1

res = max(row, col)

print(res)