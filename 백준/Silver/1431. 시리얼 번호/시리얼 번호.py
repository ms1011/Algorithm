# 길이가 짧은 문자가 먼저 온다
# 길이가 같다면 문자에 포함된 숫자의 합을 비교하여 작은 수를 앞으로 오게 한다
# 이것마저도 같다면 사전순으로 비교
# sort()를 사용하여 비교

n = int(input())

arr = []

for i in range(n):
    serial = input()
    total = sum(int(i) for i in serial if i.isnumeric())
    arr.append((serial, total))

arr.sort(key=lambda x: (len(x[0]), x[1], x[0]))

for i in arr:
    print(i[0])