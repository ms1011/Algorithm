def solution(n):
    answer = []
    for i in str(n):
        answer.append(int(i))

    return answer[::-1]
