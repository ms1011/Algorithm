n = int(input())

words = []

for _ in range(n):
    words.append(input())

words = list(set(words))

words = sorted(words, key=lambda x: (len(x), x))

for word in words:
    print(word)