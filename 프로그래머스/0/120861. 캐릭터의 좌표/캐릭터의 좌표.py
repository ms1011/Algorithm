def solution(keyinput, board):
    answer = [0, 0]

    for key in keyinput:
        if key == "left":
            if answer[0] > -(board[0] // 2):
                answer[0] -= 1
        elif key == "right":
            if answer[0] < board[0] // 2:
                answer[0] += 1
        elif key == "up":
            if answer[1] < board[1] // 2:
                answer[1] += 1
        elif key == "down":
            if answer[1] > -(board[1] // 2):
                answer[1] -= 1

    return answer