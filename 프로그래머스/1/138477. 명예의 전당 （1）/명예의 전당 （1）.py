def solution(k, score):
    answer = []
    hof = []
    for i in range(len(score)):
        if i < k:
            hof.append(score[i])
        elif score[i] > min(hof):
            hof.remove(min(hof))
            hof.append(score[i])
        hof.sort()
        answer.append(hof[0])
    return answer