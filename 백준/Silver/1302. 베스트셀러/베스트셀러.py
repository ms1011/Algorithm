# dict를 사용하여 책 이름 별 갯수 파악
# 가장 높은 수를 가진 책의 이름을 출력, 같은 것이 있다면 사전 순으로 출력

n = int(input())

books = dict()

for i in range(n):
    book = input()

    if book not in books:
        books[book] = 1
    else:
        books[book] += 1

max_val = max(books.values())

max_keys = [key for key, val in books.items() if val == max_val]

max_keys.sort()

print(max_keys[0])