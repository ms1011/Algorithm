def solution(num, k):
    answer = 0
    num = list(str(num))
    for i in range(len(num)):
        if num[i] == str(k):
            answer = i + 1
            break
        else:
            answer = -1
    return answer