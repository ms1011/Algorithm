def solution(price, money, count):
    x = 0
    for i in range(1, count + 1):
        x += price * i
    
    if x - money > 0:
        return x - money
    else:
        return 0
