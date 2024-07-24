def solution(answers):
    supo1 = [1, 2, 3, 4, 5]
    supo2 = [2, 1, 2, 3, 2, 4, 2, 5]
    supo3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    supo1_ans = []
    supo2_ans = []
    supo3_ans = []

    while len(supo1_ans) <= len(answers):
        supo1_ans += supo1
    while len(supo2_ans) <= len(answers):
        supo2_ans += supo2
    while len(supo3_ans) <= len(answers):
        supo3_ans += supo3

    cnt = {1: 0, 2: 0, 3: 0}

    for i in range(len(answers)):
        if answers[i] == supo1_ans[i]:
            cnt[1] += 1
        if answers[i] == supo2_ans[i]:
            cnt[2] += 1
        if answers[i] == supo3_ans[i]:
            cnt[3] += 1

    max_val = max(cnt.values())

    answer = [key for key, val in cnt.items() if val == max_val]

    return answer