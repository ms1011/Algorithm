def solution(s):
    answer = False
    if len(s) == 4 or len(s) == 6:
        for i in s:
            if i.isalpha():
                answer = False
                break
            else:
                answer = True
    return answer