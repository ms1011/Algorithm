def solution(food):
    answer = ''
    use_food = []

    for i in range(len(food)):
        if i == 0:
            use_food.append(food[i] - 1)
            continue
        if food[i] % 2 != 0:
            use_food.append(food[i] - 1)
        else:
            use_food.append(food[i])

    print(use_food)

    for i in range(len(use_food)):
        answer += str(i) * (use_food[i] // 2)
    answer += str(0)
    for i in range(len(use_food)-1, 0, -1):
        answer += str(i) * (use_food[i] // 2)
    return answer