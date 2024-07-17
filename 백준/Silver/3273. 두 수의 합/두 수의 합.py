n = int(input())
arr = list(map(int, input().split()))
x = int(input())
count = 0

dic = {}

for i in arr:
    target = x - i
    
    if target in dic:
        count += dic[target]

    if i in dic:
        dic[i] += 1
    else:
        dic[i] = 1
print(count)