def solution(sides):
    long_side = max(sides)
    sides.remove(long_side)
    
    if sides[0] + sides[1] > long_side:
        return 1
    else:
        return 2
