a = input()
b = input()

arr = [0 for i in range(26)]
res = 0

for ch in a:
    arr[ord(ch) - ord('a')] += 1
for ch in b:
    arr[ord(ch) - ord('a')] -= 1

print(sum(map(abs, arr)))