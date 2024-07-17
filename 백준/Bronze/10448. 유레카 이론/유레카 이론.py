tri_nums = [i * (i + 1) // 2 for i in range(1, 1001) if i * (i + 1) // 2 <= 1000]
eureka_nums = [0] * 1001

for i in range(len(tri_nums)):
    for j in range(i, len(tri_nums)):
        for k in range(j, len(tri_nums)):
            num = tri_nums[i] + tri_nums[j] + tri_nums[k]
            if num > 1000:
                break
            eureka_nums[num] = 1

T = int(input())

for i in range(T):
    a = int(input())
    print(eureka_nums[a])