# 나이 오름차순으로 정렬, 만약 나이가 같다면 먼저 입력받는 순서대로 정렬
# 나이가 같을 때, 자동으로 정렬될 것으로 예상

n = int(input())

arr = []

for i in range(n):
    arr.append(list(map(str, input().split())))

arr = sorted(arr, key=lambda x: int(x[0]))

for i in arr:
    print(i[0], i[1])

# 시간복잡도 O(n log n)