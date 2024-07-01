def solution(numbers):
    max_num = max(numbers)
    numbers.remove(max_num)
    
    answer = max_num * max(numbers)
    return answer