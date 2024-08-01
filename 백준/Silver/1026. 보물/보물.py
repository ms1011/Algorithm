N = int(input())
answer = []
a = list(map(int, input().split()))
b = list(map(int, input().split()))

for i in range(N):
    answer.append(min(a) * max(b))
    a.remove(min(a))
    b.remove(max(b))
print(sum(answer))