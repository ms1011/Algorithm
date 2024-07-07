def solution(dot):
    answer = 0
    if dot[0] >= 1 and dot[1] >= 1:
        answer = 1
    elif dot[0] < 1 and dot[1] >= 1:
        answer = 2
    elif dot[0] < 1 and dot[1] < 1:
        answer = 3
    else:
        answer = 4
    return answer