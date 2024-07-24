def solution(a, b, n):
    answer = 0

    while n >= a:
        bonus, remain = divmod(n, a)
        n = bonus * b
        answer += n
        n += remain

    return answer