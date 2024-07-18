def solution(s):
    answer = True
    p_count = 0
    y_count = 0
    for i in s:
        if i.lower() == 'p':
            p_count += 1
        if i.lower() == 'y':
            y_count += 1
            
    if p_count == y_count:
        return True
    else:
        return False