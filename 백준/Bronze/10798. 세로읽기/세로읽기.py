import sys

"""
5번 반복하여 2차원 배열로 입력을 받는다
2차원 배열의 가로와 세로를 바꿔 출력한다
세로의 값이 없더라도 5번 끝까지 반복한다 값이 없으면 출력x
"""
arr = [input() for i in range(5)]

for i in range(15):
    for j in range(5):
        if i < len(arr[j]):
            print(arr[j][i], end="")
