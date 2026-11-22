def solution(n):

    return ((n ** 0.5) + 1) ** 2 if (n ** 0.5) % 1 == 0 else -1


test_cases = [
    (121, 144),
    (3, -1),
    (1, 4),
    (4, 9),
    (9, 16),
    (16, 25),
    (25, 36),
    (100, 121),
    (101, -1),
    (1000000, 1002001),
    (1000000000000, 1000002000001),
    (49999999999999, -1),
    (50000000000000, -1)
]

for index, (n, expected) in enumerate(test_cases, start=1):
    actual = solution(n)

    print(
        f"테스트 {index}"
        f" | 입력: {n}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )