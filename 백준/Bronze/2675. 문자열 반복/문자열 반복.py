T = int(input())

for i in range(T):
    R, S = map(str, input().split())

    for j in S:
        print(int(R) * j, end='')
    print()