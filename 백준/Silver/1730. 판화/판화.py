n = int(input())
command = input()

pass_vertical = [[0 for _ in range(n)] for _ in range(n)]
pass_horizontal = [[0 for _ in range(n)] for _ in range(n)]

x, y = 0, 0

for i in command:
    if i == 'L':
        if x > 0:
            pass_vertical[y][x] = 1
            x -= 1
            pass_vertical[y][x] = 1
    if i == 'R':
        if x < n - 1:
            pass_vertical[y][x] = 1
            x += 1
            pass_vertical[y][x] = 1
    if i == 'U':
        if y > 0:
            pass_horizontal[y][x] = 1
            y -= 1
            pass_horizontal[y][x] = 1
    if i == 'D':
        if y < n - 1:
            pass_horizontal[y][x] = 1
            y += 1
            pass_horizontal[y][x] = 1

for i in range(n):
    for j in range(n):
        if pass_vertical[i][j] == 0 and pass_horizontal[i][j] == 0:
            print(".", end="")
        if pass_vertical[i][j] == 0 and pass_horizontal[i][j] == 1:
            print("|", end="")
        if pass_vertical[i][j] == 1 and pass_horizontal[i][j] == 0:
            print("-", end="")
        if pass_vertical[i][j] == 1 and pass_horizontal[i][j] == 1:
            print("+", end="")
    print()