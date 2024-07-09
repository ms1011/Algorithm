def solution(emergency):
    answer = []
    sort_emergency = sorted(emergency, reverse=True)

    for i in emergency:
        answer.append(sort_emergency.index(i) + 1)

    return answer