def solution(dots):
    answer = 0
    xy = []

    for i in range(len(dots)):
        for j in range(i+1, len(dots)):
            xy.append((dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]))


    if len(xy) != len(set(xy)):
        if xy[0] == xy[5] or xy[1] == xy[4] or xy[2] == xy[3]:
            answer = 1

    return answer