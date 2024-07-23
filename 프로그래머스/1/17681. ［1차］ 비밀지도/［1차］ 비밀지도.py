def solution(n, arr1, arr2):
    answer = [[' ' for i in range(n)] for j in range(n)]

    bin_arr1 = []
    bin_arr2 = []
    for i in arr1:
        bin_arr1.append('0' * (n - len(bin(i)[2:])) + bin(i)[2:])
    for i in arr2:
        bin_arr2.append('0' * (n - len(bin(i)[2:])) + bin(i)[2:])

    for i_idx, i_val in enumerate(bin_arr1):
        for j_idx, j_val in enumerate(bin_arr1[i_idx]):
            if j_val == '1':
                answer[i_idx][j_idx] = '#'
    for i_idx, i_val in enumerate(bin_arr2):
        for j_idx, j_val in enumerate(bin_arr2[i_idx]):
            if j_val == '1':
                answer[i_idx][j_idx] = '#'

    return [''.join(row) for row in answer]