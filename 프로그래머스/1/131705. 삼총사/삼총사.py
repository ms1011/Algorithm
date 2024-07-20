import itertools

def solution(number):
    answer = 0
    sam = list(itertools.combinations(number, 3))
    for i in sam:
        if sum(i) == 0:
            answer += 1
    return answer