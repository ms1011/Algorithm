def solution(s, n):
    answer = ''

    for i in s:
        if i == ' ':
            answer += i
            continue
        new_chr = ord(i) + n
        if i.islower() and new_chr > ord('z'):
            x = new_chr - ord('z')
            answer += chr(ord('a') + x - 1)
            continue
        if i.isupper() and new_chr > ord('Z'):
            x = new_chr - ord('Z')
            answer += chr(ord('A') + x - 1)
            continue
        else:
            answer += chr(new_chr)
    return answer