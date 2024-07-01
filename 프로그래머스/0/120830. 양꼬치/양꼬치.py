def solution(n, k):
    answer = 0
    a = n // 10
    if a > 0:
        k -= a
    
    answer = 12000 * n + k * 2000
    return answer