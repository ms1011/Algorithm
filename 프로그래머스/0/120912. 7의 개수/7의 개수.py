def solution(array):
    answer = 0
    for i in array:
        num = str(i)
        for j in range(len(num)):
            if num[j] == '7':
                answer += 1
        
    return answer