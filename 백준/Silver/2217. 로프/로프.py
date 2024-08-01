N = int(input())
answers = []
ropes = []
for i in range(N):
    ropes.append(int(input()))
ropes.sort()

for i in ropes:
    answers.append(i*N)
    N -= 1
print(max(answers))