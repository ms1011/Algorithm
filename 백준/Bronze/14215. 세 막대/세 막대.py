import sys

"""
    a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오.
    
    작은 두 수의 합이 가장 큰 수보다 
        크다면 전체의 합을 출력
        작다면 작은 두 수의 합의 두배에서 1을 뺀 값을 출력한다.
"""

arr = list(map(int, sys.stdin.readline().split()))
arr.sort()

if arr[0] + arr[1] > arr[2]:
    print(sum(arr))
else:
    print((arr[0] + arr[1]) * 2 - 1)