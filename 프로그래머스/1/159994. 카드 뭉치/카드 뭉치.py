def solution(cards1, cards2, goal):
    answer = []
    for i in goal:
        if cards1 and i == cards1[0]:
            answer.append(cards1.pop(0))
        if cards2 and i == cards2[0]:
            answer.append(cards2.pop(0))

    if answer == goal:
        return "Yes"
    else:
        return "No"