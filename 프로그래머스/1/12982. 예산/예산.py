def solution(d, budget):
    arr = []
    d.sort()
    for i in d:
        if sum(arr) + i <= budget:
            arr.append(i)
    return len(arr)