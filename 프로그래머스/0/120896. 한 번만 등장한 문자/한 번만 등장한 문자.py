def solution(s):
    answer = ''
    abc = [0] * 26
    for i in range(len(s)):
        abc[ord(s[i]) - ord('a')] += 1
    for i in range(len(abc)):
        if abc[i] == 1:
            answer += chr(ord('a') + i)
    return answer