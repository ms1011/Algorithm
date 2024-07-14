from collections import Counter

def solution(participant, completion):
    par_dict = Counter(participant)
    com_dict = Counter(completion)

    par_dict.subtract(com_dict)

    answer = [key for key, value in par_dict.items() if value != 0][0]
    return answer