import itertools

a, b, c = map(int, input().split())
s1 = [i for i in range(1, a+1)]
s2 = [i for i in range(1, b+1)]
s3 = [i for i in range(1, c+1)]

sum_list = [0] * 81

for i in itertools.product(s1, s2, s3):
    sum_list[sum(i)] += 1
    
print(sum_list.index(max(sum_list)))