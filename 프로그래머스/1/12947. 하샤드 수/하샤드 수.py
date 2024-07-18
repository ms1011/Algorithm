def solution(x):
    hab = 0
    for i in str(x):
        hab += int(i)
    
    if x % hab == 0:
        return True
    else:
        return False