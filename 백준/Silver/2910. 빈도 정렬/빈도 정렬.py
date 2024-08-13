from collections import Counter

n, c = map(int, input().split())

arr = list(map(int, input().split()))

arr_counter = Counter(arr)

sorted_arr = sorted(arr, key=lambda x: (-arr_counter[x], arr.index(x)))

print(*sorted_arr)