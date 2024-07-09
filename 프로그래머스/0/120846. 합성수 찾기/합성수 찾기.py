def solution(n):
    answer = 0

    for i in range(1, n+1):
        divisors = []
        for j in range(1, i+1):
            if i % j == 0:
                divisors.append(j)
        if len(divisors) >= 3:
            answer += 1
    return answer