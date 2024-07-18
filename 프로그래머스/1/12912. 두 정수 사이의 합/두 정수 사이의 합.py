def solution(a, b):
    answer = 0
    x, y = (a, b) if a < b else (b, a)
    for i in range(x, y+1):
        answer += i
    return answer