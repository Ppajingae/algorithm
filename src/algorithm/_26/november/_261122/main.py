def solution(n):
    return int("".join(sorted(str(n), reverse=True)))


test_cases = [
    (118372, 873211),
    (1, 1),
    (9, 9),
    (10, 10),
    (100, 100),
    (12345, 54321),
    (98765, 98765),
    (11111, 11111),
    (909090, 999000),
    (8000000000, 8000000000),
    (1234567890, 9876543210),
    (1000000001, 1100000000)
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