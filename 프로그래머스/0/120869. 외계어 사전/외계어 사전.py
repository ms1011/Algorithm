from itertools import permutations

def solution(spell, dic):
    answer = 2
    comb = [''.join(i) for i in permutations(spell)]
    for i in comb:
        if i in dic:
            answer = 1
    return answer