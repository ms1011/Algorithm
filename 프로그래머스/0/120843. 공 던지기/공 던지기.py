def solution(numbers, k):
    answer = 0
    count = 0

    for i in range(k - 1):
        count = (count + 2) % len(numbers)
    answer = numbers[count]
    return answer