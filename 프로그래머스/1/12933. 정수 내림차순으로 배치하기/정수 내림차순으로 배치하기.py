def solution(n):
    arr = []
    n = sorted(str(n), reverse=True)
    for i in n:
        arr.append(int(i))

    return int(''.join(map(str, arr)))