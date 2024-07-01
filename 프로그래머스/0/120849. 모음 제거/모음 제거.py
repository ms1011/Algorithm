def solution(my_string):
    answer = ''
    moum = "aeiou"
    for i in my_string:
        if i not in moum:
            answer += i
    return answer