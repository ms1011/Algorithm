def solution(arr):
    answer = []

    for i in range(1, len(arr) + 1):
        if i == len(arr):
            answer.append(arr[i - 1])
        elif arr[i - 1] == arr[i]:
            continue
        else:
            answer.append(arr[i - 1])

    return answer