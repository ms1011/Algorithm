import itertools

def solution(numbers):
    answer = set()
    arr = itertools.combinations(numbers, 2)
    for i in arr:
        answer.add(sum(i))
    return list(sorted(answer))