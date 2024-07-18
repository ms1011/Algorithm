def solution(numbers):
    nums = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    for i in numbers:
        if i in nums:
            nums.remove(i)
    return sum(nums)