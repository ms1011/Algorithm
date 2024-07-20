def solution(s):
    result = []
    words = s.split(' ')

    for word in words:
        new_word = []
        for i, c in enumerate(word):
            if i % 2 == 0:
                new_word.append(c.upper())
            else:
                new_word.append(c.lower())
        result.append(''.join(new_word))

    return ' '.join(result)