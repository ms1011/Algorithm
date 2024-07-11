def solution(sides):
    answer = 0

    max_num = max(sides)
    min_num = min(sides)

    for i in range(max_num - min_num, max_num):
        answer += 1

    for i in range(max_num, max_num + min_num - 1):
        answer += 1

    return answer
