def solution(babbling):
    answer = 0
    talk = ["aya", "ye", "woo", "ma"]
    
    for word in babbling:
        temp = word
        for sound in talk:
            temp = temp.replace(sound, ' ')
        if temp.strip() == '':
            answer += 1
    
    return answer