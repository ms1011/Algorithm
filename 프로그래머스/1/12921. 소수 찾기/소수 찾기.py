def solution(n):
    answer = 0
    
    # 2 ~ n 사이에 수
    for i in range(2, n+1):
        # 그 숫자가 소수인지 확인
        sosu = True
        for j in range(2, int(i**0.5) + 1):
            if i % j == 0:
                sosu = False
                break
        if sosu:
            answer += 1
                
    return answer