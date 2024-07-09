def solution(n):
    answer = 0
    count = 1
    for i in range(1, 200):
        if i % 3 == 0 or '3' in str(i):
            continue
        else:
            if count == n:
                return i
            count += 1

    return answer