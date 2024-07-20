def yaksu(n):
    nums = []
    for i in range(1, n+1):
        if n % i == 0:
            nums.append(i)
    if len(nums) % 2 == 0:
        return n
    else:
        return -n


def solution(left, right):
    answer = 0

    for i in range(left, right+1):
        answer += yaksu(i)

    return answer