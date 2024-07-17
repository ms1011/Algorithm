def convert(x, y):
    digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+/"
    res = ''
    while x > 0:
        x, mod = divmod(x, y)
        res += digits[mod]

    return res[::-1]


T = int(input())
for i in range(T):
    data = int(input())
    flag = 0
    for j in range(2, 65):
        res = convert(data, j)
        if res == res[::-1]:
            flag = 1
            break
    print(flag)