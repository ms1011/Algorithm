def solution(quiz):
    answer = []
    for i in quiz:
        left, right = i.split("=")
        left = left.split()

        if left[1] == '-':
            if int(left[0]) - int(left[2]) == int(right):
                answer.append("O")
            else:
                answer.append("X")
        else:
            if int(left[0]) + int(left[2]) == int(right):
                answer.append("O")
            else:
                answer.append("X")
    return answer