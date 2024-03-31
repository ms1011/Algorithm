N = int(input())

x = 1000 - N
count = 0
while x > 0:
    if x / 500 >= 1:
        i = int(x / 500)
        x -= 500
        count += 1
    if x / 100 >= 1:
        i = int(x / 100)
        x -= 100 * i
        count += 1 * i
    if x / 50 >= 1:
        i = int(x / 50)
        x -= 50 * i
        count += 1 * i
    if x / 10 >= 1:
        i = int(x / 10)
        x -= 10 * i
        count += 1 * i
    if x / 5 >= 1:
        i = int(x / 5)
        x -= 5 * i
        count += 1 * i
    if x / 1 >= 1:
        i = x / 1
        x -= 1 * i
        count += 1 * i

print(int(count))