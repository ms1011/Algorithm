def solution(array, commands):
    answer = []
    for command in commands:
        i, j, k = command[0], command[1], command[2]
        arr_slice = array[i-1:j]
        arr_slice = sorted(arr_slice)
        answer.append(arr_slice[k-1])
    return answer