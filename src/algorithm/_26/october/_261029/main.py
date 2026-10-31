def solution(absolutes, signs):
    answer = 0

    for index, absolute in enumerate(absolutes):
        if not signs[index]:
            answer += absolute * -1
        else:
            answer += absolute

    return answer


absolutes1 = [4, 7, 12]
signs1 = [True, False, True]

absolutes2 = [1, 2, 3]
signs2 = [False, False, True]

print(solution(absolutes1, signs1))  # 9
print(solution(absolutes2, signs2))  # 0