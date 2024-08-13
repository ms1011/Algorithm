import sys
input = sys.stdin.readline

# 출력값은 입력값의 좌표를 출력한 결과
# 입력값들을 정렬하고 정렬된 값들의 인덱스를 입력 순서에 맞춰 출력

n = int(input())
nums = list(map(int, input().split()))

dic = {}

for num in nums:
    dic[num] = 1

compressed_nums = list(dic.keys())
compressed_nums.sort()

index = {}
for idx, i in enumerate(compressed_nums):
    index[i] = idx

for i in nums:
    print(index[i], end=' ')