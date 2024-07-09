def solution(chicken):
    answer = 0
    while chicken // 10 > 0:
        div, coupon = divmod(chicken, 10)
        answer += div
        chicken = div + coupon
    return answer