def solution(n):
    res = 0
    flag = False
    while res <= n:
        if res * res == n:
            flag = True
            break
        else:
            res += 1
    if flag:
        return (res + 1) * (res + 1)
    else:
        return -1
