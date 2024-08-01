S = input()
count0 = 0
count1 = 0

S0 = S.split("1")
S1 = S.split("0")

for i in S0:
    if i == '':
        continue
    count0 += 1

for i in S1:
    if i == '':
        continue
    count1 += 1
print(min(count0, count1))