def solution(my_string):
    answer = ''.join(dict.fromkeys(my_string))        
    return answer