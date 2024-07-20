def solution(t, p):
    answer = 0

    for i in range(0, len(t) - len(p) + 1):
        a = t[i: len(p) + i]
        if a <= p:
            answer += 1

    return answer