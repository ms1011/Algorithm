def solution(score):
    answer = []
    arr = sorted([sum(i) for i in score], reverse=True)
    rank = {}
    for i,  j in enumerate(arr):
        if j not in rank:
            rank[j] = i + 1
    answer = [rank[sum(i)] for i in score]
    return answer