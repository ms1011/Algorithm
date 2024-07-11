def solution(board):
    answer = len(board) * len(board[0])
    safe_area = [[0] * len(board) for _ in range(len(board))]

    directions = [(-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 0), (0, 1), (1, -1), (1, 0), (1, 1)]

    for i in range(len(board)):
        for j in range(len(board[i])):
            if board[i][j] == 1:
                for dx, dy in directions:
                    ni, nj = i + dx, j + dy

                    if 0 <= ni < len(board) and 0 <= nj < len(board[0]):
                        safe_area[ni][nj] = 1

    for i in safe_area:
        for j in i:
            if j == 1:
                answer -= 1

    return answer