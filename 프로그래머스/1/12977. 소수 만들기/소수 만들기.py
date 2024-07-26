import itertools

def solution(nums):
    answer = 0

    comb = list(itertools.combinations(nums, 3))

    for i in comb:
        sosu = sum(i)
        flag = True
        for j in range(2, sosu):
            if sosu % j == 0:
                flag = False
        if flag:
            answer += 1

    return answer