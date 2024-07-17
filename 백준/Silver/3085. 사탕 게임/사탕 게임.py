T = int(input())

board = []
for i in range(T):
    board.append(list(input()))

count = 0


def count_row(board):
    max_num = 0
    for r in range(T):
        length = 1
        for c in range(1, T):
            if board[r][c] == board[r][c-1]:
                length += 1
            else:
                max_num = max(max_num, length)
                length = 1
        max_num = max(max_num, length)
    return max_num


def count_col(board):
    max_num = 0
    for c in range(T):
        length = 1
        for r in range(1, T):
            if board[r][c] == board[r-1][c]:
                length += 1
            else:
                max_num = max(max_num, length)
                length = 1
        max_num = max(max_num, length)
    return max_num


for i in range(T):
    for j in range(T):
        if j + 1 < T and board[i][j] != board[i][j+1]:
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j]
            count = max(count, max(count_col(board), count_row(board)))
            board[i][j], board[i][j+1] = board[i][j+1], board[i][j]

        if i + 1 < T and board[i][j] != board[i+1][j]:
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j]
            count = max(count, max(count_col(board), count_row(board)))
            board[i][j], board[i+1][j] = board[i+1][j], board[i][j]

print(count)