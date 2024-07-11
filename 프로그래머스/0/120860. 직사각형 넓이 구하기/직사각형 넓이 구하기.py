def solution(dots):
    answer = 0

    x_list = [dot[0] for dot in dots]
    y_list = [dot[1] for dot in dots]

    x_min, x_max = min(x_list), max(x_list)
    y_min, y_max = min(y_list), max(y_list)

    width = x_max - x_min
    height = y_max - y_min

    answer = width * height

    return answer
