def solution(num_list):
    jjak = 0
    hol = 0
    
    for num in num_list:
        if num % 2 == 0:
            jjak += 1
        else:
            hol += 1
    answer = [jjak, hol]
    return answer