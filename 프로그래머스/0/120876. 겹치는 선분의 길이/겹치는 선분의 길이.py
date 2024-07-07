def solution(lines):
    answer = 0
    sets = [set(range(i[0], i[1])) for i in lines]
    answer = len(sets[0] & sets[1] | sets[0] & sets[2] | sets[1] & sets[2])
    return answer