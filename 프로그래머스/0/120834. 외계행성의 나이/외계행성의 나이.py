def solution(age):
    answer = ''
    abc = {}
    for i in range(26):
        abc[i] = chr(ord('a') + i)

    for i in str(age):
        answer += abc.get(int(i))

    return answer