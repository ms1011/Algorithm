def solution(x, n):
    answer = []
    i = x
    while len(answer) < n:
        answer.append(x)
        x += i
    return answer