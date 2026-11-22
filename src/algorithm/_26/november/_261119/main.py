def solution(num):

    if num % 2 == 0:
        return "Even"
    else:
        return "Odd"



test_cases = [
    (3, "Odd"),
    (4, "Even"),
    (0, "Even"),
    (1, "Odd"),
    (2, "Even"),
    (-1, "Odd"),
    (-2, "Even"),
    (-3, "Odd"),
    (-4, "Even"),
    (1000000, "Even"),
    (2147483647, "Odd"),
    (-2147483648, "Even")
]

for index, (num, expected) in enumerate(test_cases, start=1):
    actual = solution(num)

    print(
        f"테스트 {index}"
        f" | 입력: {num}"
        f" | 결과: {actual}"
        f" | 예상: {expected}"
        f" | 통과: {actual == expected}"
    )