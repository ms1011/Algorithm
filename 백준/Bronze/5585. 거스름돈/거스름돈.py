N = 1000 - int(input())
moneys = [500, 100, 50, 10, 5, 1]
count = 0

for money in moneys:
    count += N // money
    N %= money


print(int(count))