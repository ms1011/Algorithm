def solution(s):
    answer = []
    abc_dict = {}

    for i in range(len(s)):
        if s[i] in abc_dict:
            answer.append(i - abc_dict[s[i]])
        else:
            answer.append(-1)
        abc_dict[s[i]] = i
    return answer