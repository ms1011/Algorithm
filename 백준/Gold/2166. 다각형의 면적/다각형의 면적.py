n = int(input())

answer = 0
xy = []

for i in range(n):
    xy.append(list(map(int, input().split())))
xy.append(xy[0])

for i in range(n):
    answer += xy[i][0] * xy[i+1][1] - xy[i+1][0] * xy[i][1]
print(abs(answer/2))