def solution(s):
    answer = 0
    lst = s.split(" ")

    for i in range(len(lst)):
        if lst[i].isalpha():
            answer -= int(lst[i - 1])
        else:
            answer += int(lst[i])
    return answer