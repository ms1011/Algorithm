def solution(a, b):
    answer = ''
    days = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
    months = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    day = b
    for i in range(a):
        day += months[i]
    answer = days[(day + 4) % 7]

    return answer