def solution(num):
    answer = 0
    while num != 1:
        if num % 2 == 0:
            num = num / 2
        else:
            num = (num * 3) + 1
        answer += 1
        if answer >= 500:
            return -1

    return answer


test_cases = [
    (6, 8),
    (16, 4),
    (626331, -1),
    (1, 0),
    (2, 1),
    (3, 7),
    (4, 2),
    (5, 5),
    (8, 3),
    (10, 6)
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