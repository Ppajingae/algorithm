def solution(n, lost, reserve):
    num_arr = [1] * n
    sorted_lost = sorted(lost)
    sorted_reserve = sorted(reserve)
    lost_len = 0
    res_len = 0

    for i in range(1, n + 1):
        if res_len >= len(reserve):
            res_len = 0
        if lost_len >= len(lost):
            lost_len = 0

        if sorted_reserve[res_len] == i:
            num_arr[sorted_reserve[res_len] - 1] += 1

            res_len += 1
        if sorted_lost[lost_len] == i:
            num_arr[sorted_lost[lost_len] - 1] -= 1
            lost_len += 1

    for index, i in enumerate(num_arr):
        if index == 0:
            if i == 2 and num_arr[1] == 0:
                num_arr[index] -= 1
                num_arr[1] += 1
            continue
        if index == len(num_arr) - 1:
            if i == 2 and num_arr[index - 1] == 0:
                num_arr[index] -= 1
                num_arr[index - 1] += 1
            continue
        if i == 2 and num_arr[index - 1] == 0:
            num_arr[index] -= 1
            num_arr[index - 1] += 1
        elif i == 2 and num_arr[index + 1] == 0:
            num_arr[index] -= 1
            num_arr[index + 1] += 1

    result = len([x for x in num_arr if x >= 1])
    return result


test_cases = [
    (5, [2, 4], [1, 3, 5], 5),
    (5, [2, 4], [3], 4),
    (3, [3], [1], 2)
]

for index, (n, lost, reserve, expected) in enumerate(
        test_cases, start=1
):
    actual = solution(n, lost, reserve)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )