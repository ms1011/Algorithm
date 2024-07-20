def solution(n):
    answer = []
    while n > 0:
        n, mod = divmod(n, 3)
        answer.append(str(mod))
    return int(''.join(answer), 3)