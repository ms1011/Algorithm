def solution(number, limit, power):
    answer = 0
    dic = {}

    for i in range(1, number+1):
        temp = []
        yaksu = set()
        for j in range(1, int(i**0.5 + 1)):
            if i % j == 0:
                temp.append(j)
        temp.append(i) if i != 1 else ''
        for j in temp:
            yaksu.add(i // j)
        yaksu = yaksu | set(temp)
        dic[i] = len(yaksu)

    for key, val in dic.items():
        if val > limit:
            answer += power
            continue
        else:
            answer += val

    return answer