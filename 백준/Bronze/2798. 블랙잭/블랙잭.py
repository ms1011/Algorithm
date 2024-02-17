import sys
import itertools

"""
    card 배열에 카드 값을 입력
    
    N개의 카드 중 3개를 뽑는 모든 경우의 수를 구해서 M과 비교
"""

N, M = map(int, sys.stdin.readline().split())
input_string = input().split()

card = []
for i in input_string:
    card.append(int(i))

sum_list = []

res = 0
combination_list = list(itertools.combinations(card, 3))
for combination in combination_list:
    combination_sum = sum(combination)
    if combination_sum <= M:
        sum_list.append(combination_sum)

print(max(sum_list))