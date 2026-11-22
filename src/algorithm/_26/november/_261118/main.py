def solution(n, m):
    max_data = n * m

    while not m == 0:
        temp = n % m
        n, m = m, temp
    return [n, max_data // n]


test_cases = [
    (3, 12, [3, 12]),
    (2, 5, [1, 10]),
    (1, 1, [1, 1]),
    (1, 10, [1, 10]),
    (6, 8, [2, 24]),
    (12, 18, [6, 36]),
    (7, 7, [7, 7]),
    (15, 25, [5, 75]),
    (100, 200, [100, 200]),
    (999999, 1000000, [1, 999999000000]),
    (1000000, 1000000, [1000000, 1000000])
]

for index, (n, m, expected) in enumerate(test_cases, start=1):
    actual = solution(n, m)

    print(
        f"테스트 {index}"
        f" | 입력: ({n}, {m})"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )