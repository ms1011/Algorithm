# enter인 경우 list append, leave인 경우 list remove

n = int(input())

arr = []

for i in range(n):
    name, do = input().split()
    if do == 'enter':
        arr.append(name)
    else:
        arr.remove(name)

for i in sorted(arr, reverse=True):
    print(i)