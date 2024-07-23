def solution(s):
    answer = ''
    num_abc = {
        'zero': 0,
        'one': 1,
        'two': 2,
        'three': 3,
        'four': 4,
        'five': 5,
        'six': 6,
        'seven': 7,
        'eight': 8,
        'nine': 9
    }

    temp = ''
    print(temp in num_abc)
    while len(s) >= 0:
        if temp in num_abc:
            answer += str(num_abc[temp])
            temp = ''
            continue
        if len(s) == 0:
            break
        if s[0].isnumeric():
            answer += s[0]
        else:
            temp += s[0]
        s = s[1:]

    return int(answer)