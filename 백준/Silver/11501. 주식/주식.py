t = int(input())

for i in range(t):
    N = int(input())
    days = list(map(int, input().split()))
    days.reverse()
    profit = 0
    max_num = 0

    for j in range(N):
        if max_num < days[j]:
            max_num = days[j]
            continue
        else:
            profit += max_num - days[j]
    print(profit)