def solution(array):
    count = {}
    for i in array:
        count.update({i: count.get(i, 0) + 1})
    first_key = max(count, key=count.get)
    first_value = count[first_key]
    count.pop(first_key)
    if len(count) == 0:
        return first_key
    second_key = max(count, key=count.get)
    second_value = count[second_key]
    answer = first_key
    if first_value == second_value:
        answer = -1
    return answer