N = int(input())

arr = [0] * 10001

for i in range(N):
    arr[int(input())] += 1

for i in range(len(arr)):
    while arr[i] > 0:
        print(i)
        arr[i] -= 1