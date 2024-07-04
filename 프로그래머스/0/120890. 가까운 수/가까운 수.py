def solution(array, n):
    answer = array[0]
    for i in array:
        if abs(n - answer) > abs(n - i):
            answer = i
        elif abs(n - answer) == abs(n - i):
            answer = min(answer, i)
    return answer