def solution(arr):
    return sum(arr) / len(arr)


test_cases = [
    ([1, 2, 3, 4], 2.5),
    ([5, 5], 5.0),
    ([1], 1.0),
    ([0, 0, 0], 0.0),
    ([-1, -2, -3], -2.0),
    ([-10, 10], 0.0),
    ([1, 2], 1.5),
    ([10000, -10000, 5000], 1666.6666666666667)
]

for index, (arr, expected) in enumerate(test_cases, start=1):
    actual = solution(arr)

    passed = abs(actual - expected) < 1e-9

    print(
        f"테스트 {index}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {passed}"
    )