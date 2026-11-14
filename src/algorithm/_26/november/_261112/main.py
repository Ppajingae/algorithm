def solution(d, budget):
    answer = 0
    count = 0
    sorted_d = sorted(d)
    for i in sorted_d:
        count += i
        if count <= budget:
            answer += 1
        else:
            break


    return answer


test_cases = [
    ([1, 3, 2, 5, 4], 9, 3),
    ([2, 2, 3, 3], 10, 4),
    ([1], 1, 1),
    ([5], 1, 0),
    ([1, 1, 1, 1], 2, 2),
    ([100000, 100000, 100000], 200000, 2),
    ([3, 3, 3], 5, 1)
]

for index, (d, budget, expected) in enumerate(
        test_cases, start=1
):
    actual = solution(d, budget)

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )