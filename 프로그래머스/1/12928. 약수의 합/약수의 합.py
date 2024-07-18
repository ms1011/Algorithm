def solution(x):
    answer = 0
    for i in range(1, x+1):
        if x % i == 0:
            answer += i
    return answer