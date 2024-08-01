exp = input().split('-')

nums = []

for i in exp:
    hap = 0
    plus_exp = i.split('+')

    for j in plus_exp:
        hap += int(j)
    nums.append(hap)

ans = nums[0]

for i in range(1, len(nums)):
    ans -= nums[i]
print(ans)