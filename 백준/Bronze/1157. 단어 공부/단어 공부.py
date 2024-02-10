import sys

s = input().upper()
word = list(set(s))
cnt = []

for i in word:
    a = s.count(i)
    cnt.append(a)

if cnt.count(max(cnt)) >= 2:
    print('?')
else:
    print(word[cnt.index(max(cnt))])